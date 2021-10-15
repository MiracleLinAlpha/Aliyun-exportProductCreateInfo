import api.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.*;
import org.omg.PortableInterceptor.DISCARDING;
import util.ExcelUtils;
import util.ProgressBar;
import util.utc2Local;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class execute {
    public static requestParams rp = new requestParams();
    public static utc2Local u2l = new utc2Local();
    public static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void go(requestParams rp) {

        try{
            //创建表格
            ExcelUtils.createExcel();

            ProgressBar.printProgress_init();

            //ECS
            ExcelUtils.createSheet("ECS");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "操作系统", "IP", "CPU核心数", "内存"
                    , "创建时间", "系统盘大小GB", "数据盘大小GB", "副数据盘大小GB"),false);

            int count = 0;
            for(List<Object> item:handleEcs(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }


            ProgressBar.printProgress_doing();

            //RDS
            ExcelUtils.createSheet("RDS");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "数据库类型", "数据库版本", "系列"
                    , "域名", "端口号", "CPU", "内存", "存储空间", "网络类型"),false);

            //系列  ==  双机高可用版本  只读实例   三节点企业版
            //网络类型 == 经典网络 Classic  专有网络   VPC

            count = 0;
            for(List<Object> item:handleRds(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }


            //Redis
            ExcelUtils.createSheet("Redis");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "数据库版本", "域名", "端口号"
                    , "架构类型", "网络类型"),false);

            count = 0;
            for(List<Object> item:handleRedis(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }


            //VPC
            ExcelUtils.createSheet("VPC");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "IP地址段", "路由器ID",
                    "路由表ID"),false);

            count = 0;
            for(List<Object> item:handleVpc(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }



            //SLB
            ExcelUtils.createSheet("SLB");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "IP", "实例类型",
                    "网络类型"),false);

            //实例类型   内网 intranet  公网  internet
            //网络类型   经典网络 classic  专有网络  vpc

            count = 0;
            for(List<Object> item:handleSlb(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }





            //高速通道
            ExcelUtils.createSheet("高速通道");
            ExcelUtils.addHeader(Arrays.asList("本端VPC", "本端组织", "对端VPC", "对端组织"
                    , "带宽", "创建时间"),false);

            count = 0;
            for(List<Object> item:handleHighSpeedTunnel(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }


            //MQ
            ExcelUtils.createSheet("MQ");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "Topic 数上限"
                    , "消息发送 TPS", "消息订阅 TPS"),false);

            count = 0;
            for(List<Object> item:handleMq(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }

            //K8S
            ExcelUtils.createSheet("K8S");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "Topic 数上限"
                    , "消息发送 TPS", "消息订阅 TPS"),false);


            //DTS
            ExcelUtils.createSheet("DTS数据迁移");


            ExcelUtils.createSheet("DTS数据订阅");



            ExcelUtils.createSheet("DTS数据同步");



            //ASCM组织列表
            ExcelUtils.createSheet("ASCM组织列表");



            //ASCM用户列表
            ExcelUtils.createSheet("ASCM用户列表");


        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static List<List<Object>> handleEcs(requestParams rp) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有ECS信息，遍历为实体类
            String temp = Ecs_Api.DescribeInstances(rp);
            JsonNode ecsjn = mapper.readTree(temp);
            ecsjn = ecsjn.get("Instances").get("Instance");

            List<ecsInfo> ecsinfolist = new ArrayList<>();
            for(JsonNode item:ecsjn) {
                ecsInfo ei = new ecsInfo();
                ei = (ecsInfo)mapper.readValue(item.toString(), ecsInfo.class);
                ecsinfolist.add(ei);
            }


            //读取所有DISK信息，遍历为实体类
            temp = Ecs_Api.DescribeDisks(rp);
            JsonNode diskjn = mapper.readTree(temp);
            diskjn = diskjn.get("Disks").get("Disk");

            List<diskInfo> diskInfoList = new ArrayList<>();
            for(diskInfo item:diskInfoList) {
                diskInfo di = new diskInfo();
                di = (diskInfo)mapper.readValue(item.toString(), diskInfo.class);
                diskInfoList.add(di);
            }


            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(ecsInfo item:ecsinfolist) {
                List<Object> row = new ArrayList<>();
                row.add(item.getDepartmentName());
                row.add(item.getInstanceName());
                row.add(item.getInstanceId());
                row.add(item.getOSName());
                row.add(item.getNetworkInterfaces().getNetworkInterface().get(0).getPrimaryIpAddress());
                row.add(item.getCpu());
                row.add(item.getMemory()/1024);
                row.add(u2l.utc2Local(item.getCreationTime(), "yyyy-MM-dd'T'HH:mm'Z'","yyyy-MM-dd HH:mm:ss"));

                for(diskInfo Bitem:diskInfoList) {
                    if(Bitem.getInstanceId().equals(item.getInstanceId())) {
                        if(Bitem.getType().equals("system")) {
                            row.add(Bitem.getSize());
                            break;
                        }
                    }
                }
                int count = 0;
                for(diskInfo Bitem:diskInfoList) {
                    if(Bitem.getInstanceId().equals(item.getInstanceId())) {
                        if(Bitem.getType().equals("data") && count == 0) {
                            row.add(Bitem.getSize());
                            count++;
                        }else if(Bitem.getType().equals("data") && count == 1) {
                            row.add(Bitem.getSize());
                            break;
                        }
                    }
                }

                rowList.add(row);
            }

            return rowList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }



    public static List<List<Object>> handleRds(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);


            //读取所有RDS信息，遍历为实体类
            String temp = Rds_Api.DescribeDBInstances(rp);
            JsonNode rdsjn = mapper.readTree(temp);
            rdsjn = rdsjn.get("Items").get("DBInstance");


            List<rdsInfo> rdsInfoList = new ArrayList<>();
            for(JsonNode item:rdsjn) {
                rdsInfo ri = new rdsInfo();
                ri = (rdsInfo)mapper.readValue(item.toString(), rdsInfo.class);
                rdsInfoList.add(ri);
            }


            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(rdsInfo item:rdsInfoList) {
                temp = Rds_Api.DescribeDBInstanceAttribute(rp, item.getDBInstanceId(), item.getDepartment());
                RdsInstanceInfo rii = (RdsInstanceInfo)mapper.readValue(mapper.readTree(temp).get("Items").get("DBInstance").toString(), RdsInstanceInfo.class);

                List<Object> row = new ArrayList<>();
                row.add(item.getDepartmentName());
                row.add(item.getDBInstanceDescription());
                row.add(item.getDBInstanceId());
                row.add(u2l.utc2Local(item.getCreateTime(), "yyyy-MM-dd'T'HH:mm'Z'","yyyy-MM-dd HH:mm:ss"));
                row.add(item.getEngine());
                row.add(item.getEngineVersion());
                row.add(rii.getCategory());
                row.add(rii.getConnectionString());
                row.add(rii.getPort());
                row.add(rii.getDBInstanceCPU());
                row.add(rii.getDBInstanceMemory());
                row.add(rii.getDBInstanceStorage());
                row.add(item.getInstanceNetworkType());

                rowList.add(row);

            }

            return rowList;


//     ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "数据库类型", "数据库版本", "系列"
//                    , "域名", "端口号", "CPU", "内存", "存储空间", "网络类型"),false);

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }


    public static List<List<Object>> handleRedis(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有Redis信息，遍历为实体类
            String temp = R_kvstore_Api.DescribeInstances(rp);
            JsonNode redisjn = mapper.readTree(temp);
            redisjn = redisjn.get("Instances").get("KVStoreInstance");


            List<redisInfo> redisInfoList = new ArrayList<>();
            for(JsonNode item:redisjn) {
                redisInfo ri = new redisInfo();
                ri = (redisInfo)mapper.readValue(item.toString(), redisInfo.class);
                redisInfoList.add(ri);
            }

            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(redisInfo item:redisInfoList) {
                List<Object> row = new ArrayList<>();
                row.add(item.getDepartmentName());
                row.add(item.getInstanceName());
                row.add(item.getInstanceId());
                row.add(u2l.utc2Local(item.getCreateTime(), "yyyy-MM-dd'T'HH:mm'Z'","yyyy-MM-dd HH:mm:ss"));
                row.add(item.getEngineVersion());
                row.add(item.getConnectionDomain());
                row.add(item.getPort());
                row.add(item.getNodeType());
                row.add(item.getNetworkType());

                rowList.add(row);

            }

//            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "数据库版本", "域名", "端口号"
//                    , "架构类型", "网络类型"),false);
            return rowList;




        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }


    public static List<List<Object>> handleVpc(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有Vpc信息，遍历为实体类
            String temp = Vpc_Api.DescribeVpcs(rp);
            JsonNode vpcjn = mapper.readTree(temp);
            vpcjn = vpcjn.get("Vpcs").get("Vpc");

            List<vpcInfo> vpcInfoList = new ArrayList<>();
            for(JsonNode item:vpcjn) {
                vpcInfo vi = new vpcInfo();
                vi = (vpcInfo)mapper.readValue(item.toString(), vpcInfo.class);
                vpcInfoList.add(vi);
            }

            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(vpcInfo item:vpcInfoList) {
                List<Object> row = new ArrayList<>();

                row.add(item.getDepartmentName());
                row.add(item.getVpcName());
                row.add(item.getVpcId());
                row.add(u2l.utc2Local(item.getCreationTime(), "yyyy-MM-dd'T'HH:mm'Z'","yyyy-MM-dd HH:mm:ss"));
                row.add(item.getCidrBlock());
                row.add(item.getVRouterId());
                row.add(item.getRouterTableIds().getRouterTableIds().get(0));

                rowList.add(row);
            }

//            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "IP地址段", "路由器ID",
//                    "路由表ID"),false);


            return rowList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }



    public static List<List<Object>> handleSlb(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有Vpc信息，遍历为实体类
            String temp = Slb_Api.DescribeLoadBalancers(rp);
            JsonNode slbjn = mapper.readTree(temp);
            slbjn = slbjn.get("LoadBalancers").get("LoadBalancer");

            List<slbInfo> slbInfoList = new ArrayList<>();
            for(JsonNode item:slbjn) {
                slbInfo si = new slbInfo();
                si = (slbInfo)mapper.readValue(item.toString(), slbInfo.class);
                slbInfoList.add(si);
            }

            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(slbInfo item:slbInfoList) {
                List<Object> row = new ArrayList<>();

                row.add(item.getDepartmentName());
                row.add(item.getLoadBalancerName());
                row.add(item.getLoadBalancerId());
                row.add(u2l.utc2Local(item.getCreateTime(), "yyyy-MM-dd'T'HH:mm'Z'","yyyy-MM-dd HH:mm:ss"));
                row.add(item.getAddress());
                row.add(item.getAddressType());
                row.add(item.getNetworkType());

                rowList.add(row);
            }

//            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "IP", "实例类型",
//                    "网络类型"),false);

            return rowList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }



    public static List<List<Object>> handleHighSpeedTunnel(requestParams rp) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有Vpc信息，遍历为实体类
            String temp = Vpc_Api.DescribeRouterInterfaces(rp);
            JsonNode vpcjn = mapper.readTree(temp);
            vpcjn = vpcjn.get("RouterInterfaceSet").get("RouterInterfaceType");

            List<RouterInterfaceTypeEty> RouterInterfaceTypeList = new ArrayList<>();
            for(JsonNode item:vpcjn) {
                RouterInterfaceTypeEty rity = new RouterInterfaceTypeEty();
                rity = (RouterInterfaceTypeEty)mapper.readValue(item.toString(), RouterInterfaceTypeEty.class);
                RouterInterfaceTypeList.add(rity);
            }

            List<highSpeedTunnelInfo> hstiList = new ArrayList<>();
            for(RouterInterfaceTypeEty item:RouterInterfaceTypeList) {
                highSpeedTunnelInfo hsti = new highSpeedTunnelInfo();
                if(item.getRole().equals("InitiatingSide")) {
                    for(RouterInterfaceTypeEty Bitem:RouterInterfaceTypeList) {
                        if(item.getOppositeVpcInstanceId().equals(Bitem.getVpcInstanceId())
                                && Bitem.getRole().equals("AcceptingSide")) {
                            hsti.setDepartmentName(item.getDepartmentName());
                            hsti.setVpcInstanceId(item.getVpcInstanceId());
                            hsti.setOppositeDepartmentName(Bitem.getDepartmentName());
                            hsti.setOppositeVpcInstanceId(item.getOppositeVpcInstanceId());
                            hsti.setBandwidth(item.getBandwidth());
                            hsti.setCreationTime(item.getCreationTime());
                            hstiList.add(hsti);
                            break;
                        }
                    }
                }
            }

//    ExcelUtils.addHeader(Arrays.asList("本端VPC", "本端组织", "对端VPC", "对端组织"
//            , "带宽", "创建时间"),false);

            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(highSpeedTunnelInfo item:hstiList) {
                List<Object> row = new ArrayList<>();

                row.add(item.getVpcInstanceId());
                row.add(item.getDepartmentName());
                row.add(item.getOppositeVpcInstanceId());
                row.add(item.getOppositeDepartmentName());
                row.add(item.getBandwidth());
                row.add(u2l.utc2Local(item.getCreationTime(), "yyyy-MM-dd'T'HH:mm'Z'","yyyy-MM-dd HH:mm:ss"));

                rowList.add(row);
            }

            return rowList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }



    public static List<List<Object>> handleMq(requestParams rp) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有Vpc信息，遍历为实体类
            String temp = Mq_Api.ConsoleInstanceList(rp);
            JsonNode mqjn = mapper.readTree(temp);
            mqjn = mqjn.get("Data");

            List<mqInfo> mqInfoList = new ArrayList<>();
            for(JsonNode item:mqjn) {
                mqInfo mi = new mqInfo();
                mi = (mqInfo)mapper.readValue(item.toString(), mqInfo.class);
                mqInfoList.add(mi);
            }

            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(mqInfo item:mqInfoList) {
                List<Object> row = new ArrayList<>();

                row.add(item.getDepartmentName());
                row.add(item.getInstanceName());
                row.add(item.getInstanceId());
                row.add(df.format(new Date(item.getCreateTime())));
                row.add(item.getTopicCapacity());
                row.add(item.getTpsMax());
                row.add(item.getTpsReceiveMax());

                rowList.add(row);
            }



//            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "Topic 数上限"
//                    , "消息发送 TPS", "消息订阅 TPS"),false);


            return rowList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }



}
