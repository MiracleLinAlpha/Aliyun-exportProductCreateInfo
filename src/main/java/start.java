import api.Ascm_Api;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.armsInfo;
import entity.requestParams;
import util.ExcelUtils;
import util.FileUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class start {

    public static requestParams rp = new requestParams();
    public static String displayName;
    public static Scanner scan = new Scanner(System.in);
    public static String choose = "0";

    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            //读取配置文件
            String confJson = new FileUtil().readFileInSameFolder("conf.json");
            if(confJson.equals("false")) {
                System.out.println("配置文件不存在，请确保conf.json与本程序jar包在同一目录后再重新运行 > _ <");
                return;
            }
            JsonNode confJn = mapper.readTree(confJson);
            rp = mapper.readValue(confJn.toString(), requestParams.class);


            //校验配置文件是否与系统AKSK匹配
            if(checkLogin() == true) {
                while(true) {
                    cls();
                    System.out.println(".____    .__                      \r\n"
                            + "|    |   |__| ____ ________ ____  \r\n"
                            + "|    |   |  |/    \\\\___   //    \\ \r\n"
                            + "|    |___|  |   |  \\/    /|   |  \\\r\n"
                            + "|_______ \\__|___|  /_____ \\___|  /\r\n"
                            + "        \\/       \\/      \\/    \\/ \n");
                    System.out.println("---------------------资源开通详情导出--------------------");
                    System.out.println("\n+ -- -- =>>用户:	" + displayName + "		<<\n");
                    System.out.println("\n---------------------------------------------------------\n");
                    System.out.println("\n---------------------------------------------------------\n");
                    System.out.println("\n--支持的产品  ECS RDS Redis NAS VPC SLB 高速通道 MQ K8S SLS ES DTS ");
                    System.out.println("\n--支持的产品  OdpsProject Odps账号 Odps配额 ASCM组织列表 ASCM用户列表 ");
                    System.out.println("\n	请选择工具：\n");
                    System.out.println("+ -- -- =(1、导出到Exce		        )\n");
                    System.out.println("+ -- -- =(2、导出到Json		        )\n");
                    System.out.println("+ -- -- =(3、退出				)");
                    System.out.println("----------------------------------------------------");
//                    scan.nextLine();

                    choose = scan.next();
                    switch (choose) {
                        case "1":
                            new execute().goExcel(rp);
                            return ;
                        case "2":
                            new execute().goJson(rp);
                            return;
                        case "3":
                            return;
                        default:
                            cls();
                            System.out.println("输入有误，请重输！");
                            break;
                    }
                }
            } else {
                System.out.println("AKSK不配置，请检查后重新运行 > _ <");
                return;
            }


        }catch (Exception e) {
            System.out.println("program error");
        }
    }

    public static boolean checkLogin() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        try {
            String userinfojson = Ascm_Api.GetUserInfo(rp);
            JsonNode userinfojn = mapper.readTree(userinfojson);
            userinfojn = userinfojn.get("data").get("displayName");
            displayName = userinfojn.toString();
            rp.setDisplayName(displayName);

            return true;
        } catch (Exception e) {
            System.out.println("配置文件不匹配！");
            e.printStackTrace();
            return false;
        }
    }

    public static void cls() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static class exportArms {
        public static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        public static void main(String[] args) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
                mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
                mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

                //读取配置文件
                List<String> fileList = new FileUtil().listFileNameInDir(args[0]);

                List<armsInfo> ailist = new ArrayList<>();
                for(String item:fileList) {
                    String dataJson = new FileUtil().readFileToString(args[0] + "\\" + item);
                    JsonNode dataJn = mapper.readTree(dataJson);
                    dataJn = dataJn.get("data");

                    for(JsonNode Bitem:dataJn) {
                        armsInfo ai = new armsInfo();
                        ai = mapper.readValue(Bitem.toString(), armsInfo.class);

                        String mid = item;
                        String name[] = mid.split("\\.");
                        ai.setOrgName(name[0]);
                        ailist.add(ai);
                    }
                }


                //创建表格
                ExcelUtils.createExcel();
                ExcelUtils.createSheet("ARMS");
                ExcelUtils.addHeader(Arrays.asList("组织", "实例名称", "监控类型", "创建时间"),false);

                int count = 0;
                for(armsInfo item:ailist) {
                    count++;
                    List<Object> row = new ArrayList<>();
                    row.add(item.getOrgName());
                    row.add(item.getApplication().getAppName());
                    row.add(item.getType());
                    row.add(df.format(new Date(item.getApplication().getCreatetime())));

                    ExcelUtils.insertRow(row,count);
                }

                ExcelUtils.exportExcelToSameFolder("Arms.xlsx");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
