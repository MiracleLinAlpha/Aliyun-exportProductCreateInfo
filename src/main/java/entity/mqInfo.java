package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class mqInfo {
    private String cluster;
    private String instanceName;
    private boolean namespaceRulesType;
    private int tpsReceiveMax;
    private int instanceType;
    private boolean independentNaming;
    private int instanceStatus;
    private int topicCapacity;
    private int Department;
    private String instanceId;
    private long createTime;
    private String regionId;
    private String DepartmentName;
    private int tpsMax;
    private String spInstanceId;
    private int ResourceGroup;
    private String ResourceGroupName;

    public mqInfo() {
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public boolean isNamespaceRulesType() {
        return namespaceRulesType;
    }

    public void setNamespaceRulesType(boolean namespaceRulesType) {
        this.namespaceRulesType = namespaceRulesType;
    }

    public int getTpsReceiveMax() {
        return tpsReceiveMax;
    }

    public void setTpsReceiveMax(int tpsReceiveMax) {
        this.tpsReceiveMax = tpsReceiveMax;
    }

    public int getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(int instanceType) {
        this.instanceType = instanceType;
    }

    public boolean isIndependentNaming() {
        return independentNaming;
    }

    public void setIndependentNaming(boolean independentNaming) {
        this.independentNaming = independentNaming;
    }

    public int getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(int instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public int getTopicCapacity() {
        return topicCapacity;
    }

    public void setTopicCapacity(int topicCapacity) {
        this.topicCapacity = topicCapacity;
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

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public int getTpsMax() {
        return tpsMax;
    }

    public void setTpsMax(int tpsMax) {
        this.tpsMax = tpsMax;
    }

    public String getSpInstanceId() {
        return spInstanceId;
    }

    public void setSpInstanceId(String spInstanceId) {
        this.spInstanceId = spInstanceId;
    }

    public int getResourceGroup() {
        return ResourceGroup;
    }

    public void setResourceGroup(int resourceGroup) {
        ResourceGroup = resourceGroup;
    }

    public String getResourceGroupName() {
        return ResourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        ResourceGroupName = resourceGroupName;
    }
}
