package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class rdsInfo {
    private String Category;
    private String ResourceGroupId;
    private String DBInstanceNetType;
    private String DBInstanceType;
    private boolean MutriORsignle;
    private String InstanceNetworkType;
    private int Department;
    private String DBInstanceId;
    private ReadOnlyDBInstanceIdsEty ReadOnlyDBInstanceIds;

    private String DBInstanceDescription;
    private String Engine;
    private int ResourceGroup;
    private String EngineVersion;
    private String ZoneId;
    private String DBInstanceStatus;
    private String DBInstanceClass;
    private String CreateTime;
    private String LockMode;
    private String PayType;
    private String DBInstanceStorageType;
    private int InsId;
    private SlaveZonesEty SlaveZones;
    private String ConnectionMode;
    private String VpcCloudInstanceId;
    private String DepartmentName;
    private String RegionId;
    private String ExpireTime;
    private String ResourceGroupName;


    public rdsInfo() {
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setResourceGroupId(String resourceGroupId) {
        ResourceGroupId = resourceGroupId;
    }

    public void setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
    }

    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    public void setMutriORsignle(boolean mutriORsignle) {
        MutriORsignle = mutriORsignle;
    }

    public void setInstanceNetworkType(String instanceNetworkType) {
        InstanceNetworkType = instanceNetworkType;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    public void setReadOnlyDBInstanceIds(ReadOnlyDBInstanceIdsEty readOnlyDBInstanceIds) {
        ReadOnlyDBInstanceIds = readOnlyDBInstanceIds;
    }

    public void setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public void setResourceGroup(int resourceGroup) {
        ResourceGroup = resourceGroup;
    }

    public void setEngineVersion(String engineVersion) {
        EngineVersion = engineVersion;
    }

    public void setZoneId(String zoneId) {
        ZoneId = zoneId;
    }

    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public void setLockMode(String lockMode) {
        LockMode = lockMode;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public void setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
    }

    public void setInsId(int insId) {
        InsId = insId;
    }

    public void setSlaveZones(SlaveZonesEty slaveZones) {
        SlaveZones = slaveZones;
    }

    public void setConnectionMode(String connectionMode) {
        ConnectionMode = connectionMode;
    }

    public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
        VpcCloudInstanceId = vpcCloudInstanceId;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public void setRegionId(String regionId) {
        RegionId = regionId;
    }

    public void setExpireTime(String expireTime) {
        ExpireTime = expireTime;
    }

    public void setResourceGroupName(String resourceGroupName) {
        ResourceGroupName = resourceGroupName;
    }


    public String getCategory() {
        return Category;
    }

    public String getResourceGroupId() {
        return ResourceGroupId;
    }

    public String getDBInstanceNetType() {
        return DBInstanceNetType;
    }

    public String getDBInstanceType() {
        return DBInstanceType;
    }

    public boolean isMutriORsignle() {
        return MutriORsignle;
    }

    public String getInstanceNetworkType() {
        return InstanceNetworkType;
    }

    public int getDepartment() {
        return Department;
    }

    public String getDBInstanceId() {
        return DBInstanceId;
    }

    public ReadOnlyDBInstanceIdsEty getReadOnlyDBInstanceIds() {
        return ReadOnlyDBInstanceIds;
    }

    public String getDBInstanceDescription() {
        return DBInstanceDescription;
    }

    public String getEngine() {
        return Engine;
    }

    public int getResourceGroup() {
        return ResourceGroup;
    }

    public String getEngineVersion() {
        return EngineVersion;
    }

    public String getZoneId() {
        return ZoneId;
    }

    public String getDBInstanceStatus() {
        return DBInstanceStatus;
    }

    public String getDBInstanceClass() {
        return DBInstanceClass;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public String getLockMode() {
        return LockMode;
    }

    public String getPayType() {
        return PayType;
    }

    public String getDBInstanceStorageType() {
        return DBInstanceStorageType;
    }

    public int getInsId() {
        return InsId;
    }

    public SlaveZonesEty getSlaveZones() {
        return SlaveZones;
    }

    public String getConnectionMode() {
        return ConnectionMode;
    }

    public String getVpcCloudInstanceId() {
        return VpcCloudInstanceId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public String getRegionId() {
        return RegionId;
    }

    public String getExpireTime() {
        return ExpireTime;
    }

    public String getResourceGroupName() {
        return ResourceGroupName;
    }
}
