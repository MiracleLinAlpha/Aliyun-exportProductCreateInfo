package api;

import com.aliyun.asapi.ASClient;
import entity.requestParams;

import java.util.HashMap;
import java.util.Map;

public class Dts_Api {

    public static String DescribeMigrationJobs(requestParams rp) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "DescribeMigrationJobs");
            requestParams.put("product", "Dts");
            requestParams.put("Version", "2016-08-01");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("DescribeMigrationJobs API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("DescribeMigrationJobs API Error!");
            e.printStackTrace();
            return null;
        }
    }


    public static String DescribeSubscriptionInstances(requestParams rp) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "DescribeSubscriptionInstances");
            requestParams.put("product", "Dts");
            requestParams.put("Version", "2016-08-01");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("DescribeSubscriptionInstances API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("DescribeSubscriptionInstances API Error!");
            e.printStackTrace();
            return null;
        }
    }


    public static String DescribeSynchronizationJobs(requestParams rp) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "DescribeSynchronizationJobs");
            requestParams.put("product", "Dts");
            requestParams.put("Version", "2016-08-01");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("DescribeSynchronizationJobs API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("DescribeSynchronizationJobs API Error!");
            e.printStackTrace();
            return null;
        }
    }


}
