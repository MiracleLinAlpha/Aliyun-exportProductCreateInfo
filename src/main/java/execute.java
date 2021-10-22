import api.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.*;
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
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "数据库类型", "数据库版本"
                    , "实例类型", "域名", "端口号", "CPU", "内存", "存储空间", "网络类型"),false);

            //系列  ==  双机高可用版本  只读实例   三节点企业版
            //网络类型 == 经典网络 Classic  专有网络   VPC

            ProgressBar.printProgress_doing();

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

            ProgressBar.printProgress_doing();



            //OSS





            ProgressBar.printProgress_doing();


            //NAS
            ExcelUtils.createSheet("NAS");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "容量大小GB", "协议类型"
                    , "挂载点VPC"),false);

            count = 0;
            for(List<Object> item:handleNas(rp)) {
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


            ProgressBar.printProgress_doing();


            //高速通道
            ExcelUtils.createSheet("高速通道");
            ExcelUtils.addHeader(Arrays.asList("本端VPC", "本端组织", "对端VPC", "对端组织"
                    , "带宽", "创建时间"),false);

            count = 0;
            for(List<Object> item:handleHighSpeedTunnel(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }

            ProgressBar.printProgress_doing();

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
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "Master节点"
                    , "Worker节点"),false);


            count = 0;
            for(List<Object> item:handleK8s(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }

            ProgressBar.printProgress_doing();



            //SLS
            ExcelUtils.createSheet("SLS");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间"
                    ),false);

            count = 0;
            for(List<Object> item:handleSls(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }



            //ES
            ExcelUtils.createSheet("ES");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间"
            ),false);

            count = 0;
            for(List<Object> item:handleSls(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }





            //DTSMigration
            ExcelUtils.createSheet("DTS数据迁移");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例ID", "状态", "数据库名", "源实例类型"
                    , "目的实例ID"),false);

            count = 0;
            for(List<Object> item:handleDtsMigration(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }

            ProgressBar.printProgress_doing();


            //DTSSubscription
            ExcelUtils.createSheet("DTS数据订阅");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例ID", "状态", "数据库名", "实例类型"
                    ),false);

            count = 0;
            for(List<Object> item:handleDtsSubscription(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }

            ProgressBar.printProgress_doing();


            //DTSSynchronization
            ExcelUtils.createSheet("DTS数据同步");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例ID", "实例名", "状态", "源数据库", "目的数据库"
            ),false);

            count = 0;
            for(List<Object> item:handleDtsSynchronization(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }




            //ASCM组织列表
            ExcelUtils.createSheet("ASCM组织列表");
            ExcelUtils.addHeader(Arrays.asList("组织名", "组织ID"),false);


            count = 0;
            for(List<Object> item:handleAscmOrganizationTree(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }


            //ASCM用户列表
            ExcelUtils.createSheet("ASCM用户列表");
            ExcelUtils.addHeader(Arrays.asList("显示名", "账号", "组织", "角色", "电话号码", "邮箱"
            , "状态"),false);


            count = 0;
            for(List<Object> item:handleAscmListUser(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }


            ProgressBar.printProgress_doing();

            ExcelUtils.exportExcelToSameFolder("ProductInfo.xlsx");


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
            for(JsonNode item:diskjn) {
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
//                "组织", "实例名称", "实例ID", "操作系统", "IP", "CPU核心数", "内存"
//                        , "创建时间", "系统盘大小GB", "数据盘大小GB", "副数据盘大小GB"

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
                RdsInstanceInfo rii = (RdsInstanceInfo)mapper.readValue(mapper.readTree(temp).get("Items").get("DBInstanceAttribute").get(0).toString(), RdsInstanceInfo.class);

                List<Object> row = new ArrayList<>();
                row.add(item.getDepartmentName());
                row.add(item.getDBInstanceDescription());
                row.add(item.getDBInstanceId());
                row.add(u2l.utc2Local(item.getCreateTime(), "yyyy-MM-dd'T'HH:mm:ss'Z'","yyyy-MM-dd HH:mm:ss"));
                row.add(item.getEngine());
                row.add(item.getEngineVersion());
                if(rii.getDBInstanceType().equals("Primary"))
                    row.add("主实例");
                else if(rii.getDBInstanceType().equals("Readonly"))
                    row.add("只读实例");
                else
                    row.add(rii.getDBInstanceType());
                row.add(rii.getConnectionString());
                row.add(rii.getPort());
                row.add(rii.getDBInstanceCPU());
                row.add(rii.getDBInstanceMemory()/1024);
                row.add(rii.getDBInstanceStorage());
                if(item.getInstanceNetworkType().equals("VPC"))
                    row.add("专有网络");
                else
                    row.add("经典网络");

                rowList.add(row);

            }

            return rowList;


//     ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "数据库类型", "数据库版本", "实例类型"
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
            if(!temp.contains("Instances"))
                return null;
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
                row.add(u2l.utc2Local(item.getCreateTime(), "yyyy-MM-dd'T'HH:mm:ss'Z'","yyyy-MM-dd HH:mm:ss"));
                row.add(item.getEngineVersion());
                row.add(item.getConnectionDomain());
                row.add(item.getPort());
                if(item.getNodeType().equals("double"))
                    row.add("双副本");
                else
                    row.add("null");
                if(item.getNetworkType().equals("VPC"))
                    row.add("专有网络");
                else
                    row.add("经典网络");

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


    public static List<List<Object>> handleNas(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有Redis信息，遍历为实体类
            String temp = Nas_Api.DescribeFileSystems(rp);
            if(!temp.contains("FileSystems"))
                return null;
            JsonNode nasjn = mapper.readTree(temp);
            nasjn = nasjn.get("FileSystems").get("FileSystem");


            List<NasInfo> nasInfoList = new ArrayList<>();
            for(JsonNode item:nasjn) {
                NasInfo ni = new NasInfo();
                ni = (NasInfo)mapper.readValue(item.toString(), NasInfo.class);
                nasInfoList.add(ni);
            }

            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(NasInfo item:nasInfoList) {
                List<Object> row = new ArrayList<>();
                row.add(item.getDepartmentName());
                row.add(item.getDescription());
                row.add(item.getFileSystemId());
                row.add(u2l.utc2Local(item.getCreateTime(), "yyyy-MM-dd'T'HH:mm:ss'Z'","yyyy-MM-dd HH:mm:ss"));
                row.add(item.getVolumeSize()/1073741824);
                row.add(item.getProtocolType());
                List<String> mountVpc = new ArrayList<>();
                for(MountTargetEty Bitem:item.getMountTargets().getMountTarget()) {
                   if(Bitem.getStatus().equals("active"))
                       mountVpc.add(Bitem.getVpcId());
                }
                row.add(mountVpc.toString());

                rowList.add(row);

            }

//            "组织", "实例名称", "实例ID", "创建时间", "容量大小GB", "协议类型", "挂载点VPC"

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
                row.add(u2l.utc2Local(item.getCreationTime(), "yyyy-MM-dd'T'HH:mm:ss'Z'","yyyy-MM-dd HH:mm:ss"));
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
                row.add(u2l.utc2Local(item.getCreateTime(), "yyyy-MM-dd'T'HH:mm:ss'Z'","yyyy-MM-dd HH:mm:ss"));
                row.add(item.getAddress());
                if(item.getAddressType().equals("intranet"))
                    row.add("内网");
                else
                    row.add("公网");
                if(item.getNetworkType().equals("classic"))
                    row.add("经典网络");
                else
                    row.add("专有网络");

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
                if(rity.getRouterType().equals("VRouter") && rity.getOppositeRouterType().equals("VRouter"))
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
                row.add(u2l.utc2Local(item.getCreationTime(), "yyyy-MM-dd'T'HH:mm:ss'Z'","yyyy-MM-dd HH:mm:ss"));

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

            //读取所有Mq信息，遍历为实体类
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



    public static List<List<Object>> handleK8s(requestParams rp) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有K8s信息，遍历为实体类
            String temp = K8s_Api.DescribeClusters(rp);
            temp = temp.replace("ue\":[", "ues\":[");
            JsonNode k8sjn = mapper.readTree(temp);

            List<k8sInfo> k8sList = new ArrayList<>();
            for(JsonNode item:k8sjn) {
                k8sInfo ki = new k8sInfo();
                ki = (k8sInfo)mapper.readValue(item.toString(), k8sInfo.class);
                k8sList.add(ki);
            }


            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(k8sInfo item:k8sList) {
                List<Object> row = new ArrayList<>();

                row.add(item.getDepartmentName());
                row.add(item.getName());
                row.add(item.getCluster_id());
                row.add(u2l.utc2Local(item.getCreated(), "yyyy-MM-dd'T'HH:mm:ssXXX","yyyy-MM-dd HH:mm:ss"));
                for(outputsEty Bitem:item.getOutputs()) {
                    if(Bitem.getOutputKey().contains("MasterInstanceID")) {
                        if(Bitem.getOutputValues() != null)
                            row.add(Bitem.getOutputValues().toString());
                        else
                            row.add("null");
                        break;
                    }
                }
                for(outputsEty Bitem:item.getOutputs()) {
                    if(Bitem.getOutputKey().contains("NodeInstanceID")) {
                        if(Bitem.getOutputValues() != null)
                            row.add(Bitem.getOutputValues().toString());
                        else
                            row.add("null");
                        break;
                    }
                }


                rowList.add(row);
            }

//            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "创建时间", "Master节点"
//                    , "Worker节点"),false);


            return rowList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }



    public static List<List<Object>> handleSls(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有Redis信息，遍历为实体类
            String temp = Sls_Api.ListProject(rp);
            if(!temp.contains("projects"))
                return null;
            JsonNode slsjn = mapper.readTree(temp);
            slsjn = slsjn.get("projects");


            List<slsInfo> slsInfoList = new ArrayList<>();
            for(JsonNode item:slsjn) {
                slsInfo si = new slsInfo();
                si = (slsInfo)mapper.readValue(item.toString(), slsInfo.class);
                slsInfoList.add(si);
            }

            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(slsInfo item:slsInfoList) {
                List<Object> row = new ArrayList<>();
                row.add(item.getDepartmentName());
                row.add(item.getDescription());
                row.add(item.getProjectName());
                row.add(df.format(new Date(Long.parseLong(item.getCreateTime() + "000"))));

                rowList.add(row);

            }

//            "组织", "实例名称", "实例ID", "创建时间"

            return rowList;




        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }



    public static List<List<Object>> handleDtsMigration(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有DtsMigration信息，遍历为实体类
            String temp = Dts_Api.DescribeMigrationJobs(rp);
            JsonNode Dtsjn = mapper.readTree(temp);
            Dtsjn = Dtsjn.get("MigrationJobs").get("MigrationJob");


            List<dtsMigrationInfo> dtsMList = new ArrayList<>();
            for(JsonNode item:Dtsjn) {
                dtsMigrationInfo dmi = new dtsMigrationInfo();
                dmi = (dtsMigrationInfo)mapper.readValue(item.toString(), dtsMigrationInfo.class);
                dtsMList.add(dmi);
            }

            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(dtsMigrationInfo item:dtsMList) {
                List<Object> row = new ArrayList<>();

                row.add(item.getDepartmentName());
                row.add(item.getMigrationJobID());
                row.add(item.getMigrationJobStatus());
                if(item.getMigrationObject().getSynchronousObject().size() != 0)
                    row.add(item.getMigrationObject().getSynchronousObject().get(0).getDatabaseName());
                else
                    row.add("null");
                row.add(item.getSourceEndpoint().getInstanceType());
                row.add(item.getDestinationEndpoint().getInstanceID());

                rowList.add(row);
            }

//            ExcelUtils.addHeader(Arrays.asList("组织", "实例ID", "状态", "数据库名", "源实例类型"
//                    , "目的实例ID"),false);

            return rowList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }



    public static List<List<Object>> handleDtsSubscription(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有DtsSubscription信息，遍历为实体类
            String temp = Dts_Api.DescribeSubscriptionInstances(rp);
            JsonNode Dtsjn = mapper.readTree(temp);
            Dtsjn = Dtsjn.get("SubscriptionInstances").get("SubscriptionInstance");


            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            List<Object> row = new ArrayList<>();

            row.add(Dtsjn.toString());

            rowList.add(row);

            return rowList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }



    public static List<List<Object>> handleDtsSynchronization(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有DtsSynchronization信息，遍历为实体类
            String temp = Dts_Api.DescribeSynchronizationJobs(rp);
//            temp.replace("InstanceId", "InstanceID");
            JsonNode Dtsjn = mapper.readTree(temp);
            Dtsjn = Dtsjn.get("SynchronizationInstances");

            List<dtsSynchronizationInfo> dtsSList = new ArrayList<>();
            for(JsonNode item:Dtsjn) {
                dtsSynchronizationInfo dsi = new dtsSynchronizationInfo();
                dsi = (dtsSynchronizationInfo)mapper.readValue(item.toString(), dtsSynchronizationInfo.class);
                dtsSList.add(dsi);
            }

            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(dtsSynchronizationInfo item:dtsSList) {
                List<Object> row = new ArrayList<>();

                row.add(item.getDepartmentName());
                row.add(item.getSynchronizationJobId());
                row.add(item.getSynchronizationJobName());
                row.add(item.getStatus());
                row.add(item.getSourceEndpoint().getInstanceId());
                row.add(item.getDestinationEndpoint().getInstanceId());

                rowList.add(row);
            }

//            "组织", "实例ID", "实例名", "状态", "源数据库", "目的数据库"

            return rowList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }


    public static List<List<Object>> handleAscmOrganizationTree(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有AscmOrganizationTree信息，遍历为实体类
            String temp = Ascm_Api.GetOrganizationTree(rp);
            JsonNode Ascmjn = mapper.readTree(temp);
            Ascmjn = Ascmjn.get("data").get("children");


            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            rowList.add(Arrays.asList("ROOT"));

            List<orgInfo> orgList = new ArrayList<>();
            for(JsonNode item:Ascmjn) {
                orgInfo oi = new orgInfo();
                oi = (orgInfo)mapper.readValue(item.toString(), orgInfo.class);
                orgList.add(oi);
            }

            List<orgInfo> orgListB = new ArrayList<>();
            List<orgInfo> orgListC = new ArrayList<>();
            List<orgInfo> orgListD = new ArrayList<>();
            //一级组织
            for(orgInfo item:orgList) {
                rowList.add(Arrays.asList("一级组织"));
                List<Object> row = new ArrayList<>();
                row.add(item.getName());
                row.add(item.getId());
                rowList.add(row);
                //二级组织
                if(item.getChildren() != null) {
                    rowList.add(Arrays.asList("二级组织"));
                    orgListB = item.getChildren();
                    for(orgInfo Bitem:orgListB) {
                        List<Object> rowB = new ArrayList<>();
                        rowB.add(Bitem.getName());
                        rowB.add(Bitem.getId());
                        rowList.add(rowB);
                        //三级组织
                        if(Bitem.getChildren() != null) {
                            rowList.add(Arrays.asList("三级组织"));
                            orgListC = Bitem.getChildren();
                            for(orgInfo Citem:orgListC) {
                                List<Object> rowC = new ArrayList<>();
                                rowC.add(Citem.getName());
                                rowC.add(Citem.getId());
                                rowList.add(rowC);
                                //四级组织
                                if(Citem.getChildren() != null) {
                                    rowList.add(Arrays.asList("四级组织"));
                                    orgListD = Citem.getChildren();
                                    for(orgInfo Ditem:orgListD) {
                                        List<Object> rowD = new ArrayList<>();
                                        rowD.add(Ditem.getName());
                                        rowD.add(Ditem.getId());
                                        rowList.add(rowD);
                                    }
                                }
                            }
                        }
                    }
                }
            }

//            "组织名", "组织ID"

            return rowList;


        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }



    public static List<List<Object>> handleAscmListUser(requestParams rp) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取所有AscmListUser信息，遍历为实体类
            String temp = Ascm_Api.ListUsers(rp);
            temp.replace("default", "Default");
            JsonNode Ascmjn = mapper.readTree(temp);
            Ascmjn = Ascmjn.get("data");


            List<userInfo> uiList = new ArrayList<>();
            for(JsonNode item:Ascmjn) {
                userInfo ui = new userInfo();
                ui = (userInfo)mapper.readValue(item.toString(), userInfo.class);
                uiList.add(ui);
            }

            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(userInfo item:uiList) {
                List<Object> row = new ArrayList<>();

                row.add(item.getDisplayName());
                row.add(item.getLoginName());
                row.add(item.getOrganization().getName());
                if(item.getRoles() != null) {
                    List<String> roleList = new ArrayList<>();
                    for(rolesEty Bitem:item.getRoles()) {
                        if(Bitem.getCode().equals("ROLE_RESOURCE_USER")) {
                            roleList.add("资源使用人");
                        } else {
                            String str[] = Bitem.getCode().split("_");
                            roleList.add(str[1]);
                        }
                    }
                    row.add(roleList.toString());
                } else {
                    row.add(" ");
                }
                row.add(item.getCellphoneNum());
                row.add(item.getEmail());
                if(item.getStatus().equals("ACTIVE")) {
                    row.add("激活中");
                } else {
                    row.add(item.getStatus());
                }



                rowList.add(row);
            }

//            "显示名", "账号", "组织", "角色", "电话号码", "邮箱", "状态"

            return rowList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }


    public static void testEty(requestParams rp) {
        try {
            List<List<Object>> temp = handleSls(rp);

            for(List<Object> item:temp) {
                System.out.println(item.toString());
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
