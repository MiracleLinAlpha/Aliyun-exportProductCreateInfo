package api;

import com.aliyun.asapi.ASClient;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.edas.model.v20170801.ListApplicationEcuRequest;
import com.aliyuncs.edas.model.v20170801.ListApplicationEcuResponse;
import com.aliyuncs.edas.model.v20170801.ListApplicationRequest;
import com.aliyuncs.edas.model.v20170801.ListApplicationResponse;
import com.aliyuncs.profile.DefaultProfile;
import entity.requestParams;

import java.util.HashMap;
import java.util.Map;

public class Edas_Api {

    public static String ListApplicationEcu (requestParams rp) {
        try {
            String regionId = rp.getRegionId();
            String accessKeyId = rp.getAccessKeyId();
            String accessKeySecret = rp.getAccessKeySecret();
            String productName ="Edas";

            java.net.URL  url = new  java.net.URL(rp.getApiGateWay());
            String[] strArr = url.getHost().split("\\.");

            String domain = "edas-api.console." + rp.getRegionId() + ".res." + strArr[3] + "." + strArr[4];


            DefaultProfile.addEndpoint(regionId,productName,domain);
            DefaultProfile defaultProfile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
            DefaultAcsClient defaultAcsClient = new DefaultAcsClient(defaultProfile);
            defaultAcsClient.setAutoRetry(false);


            ListApplicationEcuRequest request = new ListApplicationEcuRequest();

            //参数
//            String appId = "";
//            request.setAppId(appId);

            ListApplicationEcuResponse response = defaultAcsClient.getAcsResponse(request);
            // 结果解析(code=200表示调用成功,其他均为失败调用具体参考列表)
            if (response.getCode() == 200) {
                // 解析具体返回结果(参考具体接口返回值)
//                System.out.println(response.getEcuInfoList());
                for(int i=0;i<response.getEcuInfoList().size();i++) {
                    System.out.println(response.getEcuInfoList().get(i).getRegionId());
                    System.out.println(response.getEcuInfoList().get(i).getAvailableCpu());
                    System.out.println(response.getEcuInfoList().get(i).getEcuId());
                }
            } else {
                // 打印错误原因
                System.out.println(response.getMessage());
            }



//            System.out.println("ListApplicationEcu  API Success!");
            return "";
        } catch (Exception e) {
            System.out.println("ListApplicationEcu  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    public static String ListApplication (requestParams rp) {
        try {
            String regionId = rp.getRegionId();
            String accessKeyId = rp.getAccessKeyId();
            String accessKeySecret = rp.getAccessKeySecret();
            String productName ="Edas";

            java.net.URL  url = new  java.net.URL(rp.getApiGateWay());
            String[] strArr = url.getHost().split("\\.");

            String domain = "edas-api.console." + rp.getRegionId() + ".res." + strArr[3] + "." + strArr[4];


            DefaultProfile.addEndpoint(regionId,productName,domain);
            DefaultProfile defaultProfile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
            DefaultAcsClient defaultAcsClient = new DefaultAcsClient(defaultProfile);
            defaultAcsClient.setAutoRetry(false);


            ListApplicationRequest request = new ListApplicationRequest();

            //参数
//            String appId = "";
//            request.setAppId(appId);

            ListApplicationResponse response = defaultAcsClient.getAcsResponse(request);
            // 结果解析(code=200表示调用成功,其他均为失败调用具体参考列表)
            if (response.getCode() == 200) {
                // 解析具体返回结果(参考具体接口返回值)
                System.out.println(response.getApplicationList());
            } else {
                // 打印错误原因
                System.out.println(response.getMessage());
            }



//            System.out.println("ListApplication  API Success!");
            return "";
        } catch (Exception e) {
            System.out.println("ListApplication  API Error!");
            e.printStackTrace();
            return null;
        }
    }
}
