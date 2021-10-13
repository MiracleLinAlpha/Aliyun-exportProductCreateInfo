import api.Ecs_Api;
import api.R_kvstore_Api;
import api.Rds_Api;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.*;
import org.omg.PortableInterceptor.DISCARDING;
import util.ExcelUtils;
import util.ProgressBar;
import util.utc2Local;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class execute {
    public static requestParams rp = new requestParams();
    public static utc2Local u2l = new utc2Local();

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
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "数据库类型", "数据库版本", "系列"
                    , "域名", "CPU", "内存", "创建时间", "网络类型"),false);

            //系列  ==  双机高可用版本  只读实例
            //网络类型 == 经典网络   专有网络

            count = 0;
            for(List<Object> item:handleRds(rp)) {
                count++;
                ExcelUtils.insertRow(item,count);
            }


            //Redis
            ExcelUtils.createSheet("Redis");
            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "数据库版本", "系列", "域名", "端口号"
                    , "CPU", "内存", "创建时间", "网络类型"),false);


            //VPC
            ExcelUtils.createSheet("VPC");


            //SLB
            ExcelUtils.createSheet("SLB");


            //高速通道
            ExcelUtils.createSheet("高速通道");


            //MQ
            ExcelUtils.createSheet("MQ");



            //K8S
            ExcelUtils.createSheet("K8S");



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
            for(rdsInfo item:rdsInfoList) {
                rdsInfo ri = new rdsInfo();
                ri = (rdsInfo)mapper.readValue(item.toString(), rdsInfo.class);
                rdsInfoList.add(ri);
            }


            //加入Object List
            List<List<Object>> rowList = new ArrayList<>();
            for(rdsInfo item:rdsInfoList) {
                List<Object> row = new ArrayList<>();
                row.add(item.getDepartmentName());
                row.add(item.getDBInstanceDescription());
                row.add(item.getDBInstanceId());
                row.add(item.getEngine());
                row.add(item.getEngineVersion());
                row.add();
                row.add(item.get);
                row.add();
                row.add(u2l.utc2Local(item.getCreateTime(), "yyyy-MM-dd'T'HH:mm'Z'","yyyy-MM-dd HH:mm:ss"));
                row.add(item.getConnectionMode());
                row.add();

                rowList.add(row);

            }

            return rowList;

//            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "数据库类型", "数据库版本", "系列"
//                    , "CPU", "内存", "创建时间", "网络类型", "IP"),false);

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
            for(redisInfo item:redisInfoList) {
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
                row.add(item.getEngineVersion()));
                row.add(item.getNodeType());
                row.add(item.getConnectionDomain());
                row.add(item.get);
                row.add();
                row.add(u2l.utc2Local(item.getCreateTime(), "yyyy-MM-dd'T'HH:mm'Z'","yyyy-MM-dd HH:mm:ss"));
                row.add(item.getNetworkType());

                rowList.add(row);

            }
            //            ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "实例ID", "数据库版本", "系列", "域名", "端口号"
//            , "CPU", "内存", "创建时间", "网络类型"),false);

            return rowList;




        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }




}
