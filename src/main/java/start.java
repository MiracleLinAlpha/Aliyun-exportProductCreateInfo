import api.Ascm_Api;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.requestParams;
import util.FileUtil;

import java.io.IOException;
import java.util.Scanner;

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
                    System.out.println("\n--支持的产品  ECS RDS Redis VPC SLB 高速通道 MQ K8S DTS ASCM组织列表 ASCM用户列表");
                    System.out.println("\n	请选择工具：\n");
                    System.out.println("+ -- -- =(1、开始		        )\n");
                    System.out.println("+ -- -- =(2、退出				)");
                    System.out.println("----------------------------------------------------");
//                    scan.nextLine();

                    choose = scan.next();
                    switch (choose) {
                        case "1":
                            new execute().testEty(rp);
                            return ;
                        case "2":
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

}
