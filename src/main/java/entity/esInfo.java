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

    public esInfo() {
    }

    public Object getClientNodeConfiguration() {
        return clientNodeConfiguration;
    }

    public void setClientNodeConfiguration(Object clientNodeConfiguration) {
        this.clientNodeConfiguration = clientNodeConfiguration;
    }

    public boolean isInited() {
        return inited;
    }

    public void setInited(boolean inited) {
        this.inited = inited;
    }

    public List<Object> getClusterTasks() {
        return clusterTasks;
    }

    public void setClusterTasks(List<Object> clusterTasks) {
        this.clusterTasks = clusterTasks;
    }

    public List<Object> getPublicIpWhitelist() {
        return publicIpWhitelist;
    }

    public void setPublicIpWhitelist(List<Object> publicIpWhitelist) {
        this.publicIpWhitelist = publicIpWhitelist;
    }

    public List<Object> getEsIPBlacklist() {
        return esIPBlacklist;
    }

    public void setEsIPBlacklist(List<Object> esIPBlacklist) {
        this.esIPBlacklist = esIPBlacklist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public List<Object> getKibanaIPWhitelist() {
        return kibanaIPWhitelist;
    }

    public void setKibanaIPWhitelist(List<Object> kibanaIPWhitelist) {
        this.kibanaIPWhitelist = kibanaIPWhitelist;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public boolean isEnablePublic() {
        return enablePublic;
    }

    public void setEnablePublic(boolean enablePublic) {
        this.enablePublic = enablePublic;
    }

    public Object getMasterConfiguration() {
        return masterConfiguration;
    }

    public void setMasterConfiguration(Object masterConfiguration) {
        this.masterConfiguration = masterConfiguration;
    }

    public boolean isHaveClientNode() {
        return haveClientNode;
    }

    public void setHaveClientNode(boolean haveClientNode) {
        this.haveClientNode = haveClientNode;
    }

    public List<Object> getPrivateNetworkIpWhiteList() {
        return privateNetworkIpWhiteList;
    }

    public void setPrivateNetworkIpWhiteList(List<Object> privateNetworkIpWhiteList) {
        this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
    }

    public int getNodeAmount() {
        return nodeAmount;
    }

    public void setNodeAmount(int nodeAmount) {
        this.nodeAmount = nodeAmount;
    }

    public String getEsVersion() {
        return esVersion;
    }

    public void setEsVersion(String esVersion) {
        this.esVersion = esVersion;
    }

    public int getResourceGroup() {
        return ResourceGroup;
    }

    public void setResourceGroup(int resourceGroup) {
        ResourceGroup = resourceGroup;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public networkConfigEty getNetworkConfig() {
        return networkConfig;
    }

    public void setNetworkConfig(networkConfigEty networkConfig) {
        this.networkConfig = networkConfig;
    }

    public nodeSpecEty getNodeSpec() {
        return nodeSpec;
    }

    public void setNodeSpec(nodeSpecEty nodeSpec) {
        this.nodeSpec = nodeSpec;
    }

    public List<Object> getDictList() {
        return dictList;
    }

    public void setDictList(List<Object> dictList) {
        this.dictList = dictList;
    }

    public List<Object> getIkHotDicts() {
        return ikHotDicts;
    }

    public void setIkHotDicts(List<Object> ikHotDicts) {
        this.ikHotDicts = ikHotDicts;
    }

    public boolean isWarmNode() {
        return warmNode;
    }

    public void setWarmNode(boolean warmNode) {
        this.warmNode = warmNode;
    }

    public List<Object> getEsIPWhitelist() {
        return esIPWhitelist;
    }

    public void setEsIPWhitelist(List<Object> esIPWhitelist) {
        this.esIPWhitelist = esIPWhitelist;
    }

    public Object getEsConfig() {
        return esConfig;
    }

    public void setEsConfig(Object esConfig) {
        this.esConfig = esConfig;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public kibanaConfigurationEty getKibanaConfiguration() {
        return kibanaConfiguration;
    }

    public void setKibanaConfiguration(kibanaConfigurationEty kibanaConfiguration) {
        this.kibanaConfiguration = kibanaConfiguration;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public List<Object> getSynonymsDicts() {
        return synonymsDicts;
    }

    public void setSynonymsDicts(List<Object> synonymsDicts) {
        this.synonymsDicts = synonymsDicts;
    }

    public boolean isDedicateMaster() {
        return dedicateMaster;
    }

    public void setDedicateMaster(boolean dedicateMaster) {
        this.dedicateMaster = dedicateMaster;
    }

    public String getWarmNodeConfiguration() {
        return warmNodeConfiguration;
    }

    public void setWarmNodeConfiguration(String warmNodeConfiguration) {
        this.warmNodeConfiguration = warmNodeConfiguration;
    }

    public boolean isAdvancedDedicateMaster() {
        return advancedDedicateMaster;
    }

    public void setAdvancedDedicateMaster(boolean advancedDedicateMaster) {
        this.advancedDedicateMaster = advancedDedicateMaster;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResourceGroupName() {
        return ResourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        ResourceGroupName = resourceGroupName;
    }
}
