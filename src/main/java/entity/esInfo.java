package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class esInfo {
    private Object clientNodeConfiguration;
    private boolean inited;
    private List<Object> clusterTasks;
    private List<Object> publicIpWhitelist;
    private List<Object> esIPBlacklist;
    private String description;
    private String paymentType;
    private List<Object> kibanaIPWhitelist;
    private String createdAt;
    private int Department;
    private String instanceId;
    private boolean enablePublic;
    private Object masterConfiguration;
    private boolean haveClientNode;
    private List<Object> privateNetworkIpWhiteList;
    private int nodeAmount;
    private String esVersion;
    private int ResourceGroup;
    private String updatedAt;
    private networkConfigEty networkConfig;

    private nodeSpecEty nodeSpec;
    private List<Object> dictList;
    private List<Object> ikHotDicts;
    private boolean warmNode;
    private List<Object> esIPWhitelist;
    private Object esConfig;
    private String DepartmentName;
    private kibanaConfigurationEty kibanaConfiguration;
    private int endTime;
    private List<Object> synonymsDicts;
    private boolean dedicateMaster;
    private String warmNodeConfiguration;
    private boolean advancedDedicateMaster;
    private String status;
    private String ResourceGroupName;

}
