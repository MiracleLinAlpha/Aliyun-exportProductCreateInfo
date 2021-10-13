package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class redisInfo {
    private int Connections;
    private String Config;
    private int Port;
    private boolean HasRenewChangeOrder;
    private String ConnectionDomain;
    private int Department;
    private String PrivateIp;
    private int QPS;
    private int Capacity;
    private String NetworkType;
    private String InstanceStatus;
    private String PackageType;
    private int Bandwidth;
    private String InstanceType;
    private int ResourceGroup;
    private String ArchitectureType;
    private String UserName;
    private String EngineVersion;
    private String ZoneId;
    private String InstanceId;
    private String VSwitchId;
    private String CreateTime;
    private String InstanceClass;
    private boolean IsRds;
    private String InstanceName;
    private String VpcId;
    private String ChargeType;
    private String NodeType;
    private String DepartmentName;
    private String RegionId;
    private String ResourceGroupName;


    public redisInfo() {
    }

    public int getConnections() {
        return Connections;
    }

    public void setConnections(int connections) {
        Connections = connections;
    }

    public String getConfig() {
        return Config;
    }

    public void setConfig(String config) {
        Config = config;
    }

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        Port = port;
    }

    public boolean isHasRenewChangeOrder() {
        return HasRenewChangeOrder;
    }

    public void setHasRenewChangeOrder(boolean hasRenewChangeOrder) {
        HasRenewChangeOrder = hasRenewChangeOrder;
    }

    public String getConnectionDomain() {
        return ConnectionDomain;
    }

    public void setConnectionDomain(String connectionDomain) {
        ConnectionDomain = connectionDomain;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public String getPrivateIp() {
        return PrivateIp;
    }

    public void setPrivateIp(String privateIp) {
        PrivateIp = privateIp;
    }

    public int getQPS() {
        return QPS;
    }

    public void setQPS(int QPS) {
        this.QPS = QPS;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public String getNetworkType() {
        return NetworkType;
    }

    public void setNetworkType(String networkType) {
        NetworkType = networkType;
    }

    public String getInstanceStatus() {
        return InstanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        InstanceStatus = instanceStatus;
    }

    public String getPackageType() {
        return PackageType;
    }

    public void setPackageType(String packageType) {
        PackageType = packageType;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        Bandwidth = bandwidth;
    }

    public String getInstanceType() {
        return InstanceType;
    }

    public void setInstanceType(String instanceType) {
        InstanceType = instanceType;
    }

    public int getResourceGroup() {
        return ResourceGroup;
    }

    public void setResourceGroup(int resourceGroup) {
        ResourceGroup = resourceGroup;
    }

    public String getArchitectureType() {
        return ArchitectureType;
    }

    public void setArchitectureType(String architectureType) {
        ArchitectureType = architectureType;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEngineVersion() {
        return EngineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        EngineVersion = engineVersion;
    }

    public String getZoneId() {
        return ZoneId;
    }

    public void setZoneId(String zoneId) {
        ZoneId = zoneId;
    }

    public String getInstanceId() {
        return InstanceId;
    }

    public void setInstanceId(String instanceId) {
        InstanceId = instanceId;
    }

    public String getVSwitchId() {
        return VSwitchId;
    }

    public void setVSwitchId(String VSwitchId) {
        this.VSwitchId = VSwitchId;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getInstanceClass() {
        return InstanceClass;
    }

    public void setInstanceClass(String instanceClass) {
        InstanceClass = instanceClass;
    }

    public boolean isRds() {
        return IsRds;
    }

    public void setRds(boolean rds) {
        IsRds = rds;
    }

    public String getInstanceName() {
        return InstanceName;
    }

    public void setInstanceName(String instanceName) {
        InstanceName = instanceName;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public String getNodeType() {
        return NodeType;
    }

    public void setNodeType(String nodeType) {
        NodeType = nodeType;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getRegionId() {
        return RegionId;
    }

    public void setRegionId(String regionId) {
        RegionId = regionId;
    }

    public String getResourceGroupName() {
        return ResourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        ResourceGroupName = resourceGroupName;
    }
}
