package api;

import com.aliyun.asapi.ASClient;
import entity.requestParams;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Mq_Api {

    //列举集群列表
    public static String ConsoleClusterList (requestParams rp) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleClusterList");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleClusterList  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleClusterList  API Error!");
            e.printStackTrace();
            return null;
        }
    }

    //列举指定实例内的topic
    public static String ConsoleTopicList (requestParams rp, String instanceId, int department) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleTopicList");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);

            requestParams.put("Department",String.valueOf(department));


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleTopicList  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleTopicList  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //列举所有MQ实例
    public static String ConsoleInstanceList (requestParams rp) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleInstanceList");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleInstanceList  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleInstanceList  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //列举指定MQ实例的信息
    public static String ConsoleInstanceBaseInfo (requestParams rp, String instanceId, int department) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleInstanceBaseInfo");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);
            requestParams.put("Department",String.valueOf(department));


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleInstanceBaseInfo  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleInstanceBaseInfo  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //更新指定MQ实例的配置信息
    public static String ConsoleInstanceUpdate (requestParams rp, String instanceId, int department, String instanceName,
                                                int maxReceiveTps, int maxSendTps, int topicCapacity, String remark) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleInstanceUpdate");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);
            requestParams.put("Department",String.valueOf(department));


            //实例名称
            requestParams.put("InstanceName",instanceName);
            //消息订阅 TPS
            requestParams.put("MaxReceiveTps",maxReceiveTps);
            //消息发送 TPS
            requestParams.put("MaxSendTps",maxSendTps);
            //Topic 数上限
            requestParams.put("TopicCapacity",topicCapacity);
            //备注
            requestParams.put("remark",remark);



            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleInstanceUpdate  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleInstanceUpdate  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //为MQ实例添加topic
    public static String ConsoleTopicCreate (requestParams rp, String instanceId, int department,
                                             String topic, int orderType, String remark) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleTopicCreate");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);
            requestParams.put("Department",String.valueOf(department));

            //Topic
            requestParams.put("Topic",topic);
            //消息类型   0=普通消息   1=分区顺序消息   2=全局顺序消息
            //4=事务消息     5=定时/延时消息
            requestParams.put("OrderType",orderType);
            //描述
            requestParams.put("Remark",remark);




            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleTopicCreate  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleTopicCreate  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //为指定MQ实例删除topic
    public static String ConsoleTopicDelete (requestParams rp, String instanceId, int department,
                                             String topic) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleTopicDelete");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);
            requestParams.put("Department",String.valueOf(department));

            requestParams.put("Topic",topic);


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleTopicDelete  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleTopicDelete  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //查看指定MQ实例的topic授权信息
    public static String ConsoleEmpowerList (requestParams rp, String instanceId, int department,
                                             String topic) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleEmpowerList");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);
            requestParams.put("Department",String.valueOf(department));

            requestParams.put("Topic",topic);


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleEmpowerList  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleEmpowerList  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //为指定的MQ实例  指定的topic授权
    public static String ConsoleEmpowerCreateBySub (requestParams rp, String instanceId, int department,
                                             String topic, String empowerUser, int relation) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleEmpowerCreateBySub");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);
            requestParams.put("Department",String.valueOf(department));

            requestParams.put("Topic",topic);
            //账号类型  1=子账号
            requestParams.put("UserType",1);
            //授权人账户名(子账号名称)
            requestParams.put("EmpowerUser",empowerUser);
            //授权类型   2=发布   4=订阅    6=发布和订阅
            requestParams.put("relation",relation);


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleEmpowerCreateBySub  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleEmpowerCreateBySub  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //为指定的MQ实例  指定的topic  删除对应子账号的授权
    public static String ConsoleEmpowerDelete (requestParams rp, String instanceId, int department,
                                                    String topic, String userId) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleEmpowerDelete");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);
            requestParams.put("Department",String.valueOf(department));

            requestParams.put("Topic",topic);
            //授权人账户名(子账号名称)  需要在ConsoleEmpowerList 中查询对应的用户 userId
            requestParams.put("EmpowerUser",userId);


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleEmpowerDelete  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleEmpowerDelete  API Error!");
            e.printStackTrace();
            return null;
        }
    }

    //列举指定实例内的Group
    public static String ConsoleGroupListInPage (requestParams rp, String instanceId, int department) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleGroupListInPage");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);

            requestParams.put("Department",String.valueOf(department));


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleGroupListInPage  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleGroupListInPage  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //指定实例内    创建Group
    public static String ConsoleGroupCreate (requestParams rp, String instanceId, int department,
                                             String groupId, String remark) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleGroupCreate");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);

            requestParams.put("Department",String.valueOf(department));

            requestParams.put("GroupId",groupId);
            requestParams.put("Remark",remark);


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleGroupCreate  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleGroupCreate  API Error!");
            e.printStackTrace();
            return null;
        }
    }

    //指定实例内   指定Group  查看授权
    public static String ConsoleEmpowerListGroup (requestParams rp, String instanceId, int department,
                                             String groupId) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleEmpowerListGroup");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);

            requestParams.put("Department",String.valueOf(department));

            requestParams.put("GroupId",groupId);


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleEmpowerListGroup  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleEmpowerListGroup  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //指定实例内   指定Group  为子账户授权
    public static String ConsoleEmpowerCreateGroupBySub (requestParams rp, String instanceId, int department,
                                                  String groupId, String empowerUser) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleEmpowerCreateGroupBySub");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);

            requestParams.put("Department",String.valueOf(department));

            requestParams.put("GroupId",groupId);
            //账号类型  1=子账号
            requestParams.put("UserType",1);
            requestParams.put("EmpowerUser",empowerUser);



            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleEmpowerCreateGroupBySub  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleEmpowerCreateGroupBySub  API Error!");
            e.printStackTrace();
            return null;
        }
    }



    //指定实例内   指定Group  删除对应子账户的授权
    public static String ConsoleEmpowerDeleteGroup (requestParams rp, String instanceId, int department,
                                                         String groupId, String empowerUser) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleEmpowerDeleteGroup");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);

            requestParams.put("Department",String.valueOf(department));

            requestParams.put("GroupId",groupId);
            //empowerUser必须为  ConsoleEmpowerListGroup 中获取的用户ID  userId
            requestParams.put("EmpowerUser",empowerUser);



            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleEmpowerDeleteGroup  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleEmpowerDeleteGroup  API Error!");
            e.printStackTrace();
            return null;
        }
    }


    //指定实例内   指定Group  查看授权
    public static String ConsoleGroupDelete (requestParams rp, String instanceId, int department,
                                                  String groupId) {
        try {
            Map<String, Object> requestParams = new HashMap<String, Object>();
            requestParams.put("action", "ConsoleGroupDelete");
            requestParams.put("product", "Ons-inner");
            requestParams.put("Version", "2018-02-05");
            requestParams.put("RegionId", rp.getRegionId());
            requestParams.put("AccessKeyId", rp.getAccessKeyId());
            requestParams.put("AccessKeySecret", rp.getAccessKeySecret());

            requestParams.put("OnsRegionId",rp.getRegionId());
            requestParams.put("PreventCache",new Date().getTime());

            requestParams.put("InstanceId",instanceId);

            requestParams.put("Department",String.valueOf(department));

            requestParams.put("GroupId",groupId);


            ASClient client = new ASClient();
            client.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            String result = client.doRequest(rp.getApiGateWay(), requestParams);

//            System.out.println("ConsoleGroupDelete  API Success!");
            return result;
        } catch (Exception e) {
            System.out.println("ConsoleGroupDelete  API Error!");
            e.printStackTrace();
            return null;
        }
    }

}
