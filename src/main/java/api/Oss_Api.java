package api;

import com.aliyun.asapi.ASClient;
import entity.requestParams;

import java.util.HashMap;
import java.util.Map;

public class Oss_Api {
    public static String GetService(requestParams rp, String organizationid) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "GetService");
            requestParams.put("product", "oss");
            requestParams.put("Version", "2019-05-17");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OrganizationId", organizationid);

            requestParams.put("pageSize", "500");

            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");

            client.addHeader("x-acs-organizationid", organizationid);

            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("GetService API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("GetService API Error!");
            e.printStackTrace();
            return null;
        }
    }
}
