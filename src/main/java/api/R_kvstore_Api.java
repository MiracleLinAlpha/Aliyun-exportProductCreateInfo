package api;

import com.aliyun.asapi.ASClient;
import entity.requestParams;

import java.util.HashMap;
import java.util.Map;

public class R_kvstore_Api {

    public static String DescribeInstances(requestParams rp) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "DescribeInstances");
            requestParams.put("product", "R-kvstore");
            requestParams.put("Version", "2015-01-01");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("DescribeInstances API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("DescribeInstances API Error!");
            e.printStackTrace();
            return null;
        }
    }

}
