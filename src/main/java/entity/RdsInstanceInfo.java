package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class RdsInstanceInfo {
    private int DBInstanceMemory;
    private String ResourceGroupId;
    private String Port;
    private String LatestKernelVersion;
    private String DBInstanceType;
    private String InstanceNetworkType;
    private String DBInstanceClassType;
    private String DBInstanceId;
    private String AutoUpgradeMinorVersion;
    private int DBInstanceStorage;
    private String AvailabilityValue;
    private String Engine;
    private String DBInstanceDescription;
    private String IPType;
    private long DBInstanceDiskUsed;
    private String EngineVersion;
    private int MaxConnections;
    private String DBInstanceStatus;
    private String SlaveConnectionString;
    private String DBInstanceClass;
    private int AccountMaxQuantity;
    private String VSwitchId;
    private String PayType;
    private String LockMode;
    private String SupportCreateSuperAccount;
    private int InsId;
    private String VpcId;
    private String CurrentKernelVersion;
    private String ConnectionMode;
    private String CreationTime;
    private String VpcCloudInstanceId;
    private String ProxyType;
    private String ConnectionString;
    private String ExpireTime;
    private int DBMaxQuantity;
    private String Category;
    private String DBInstanceNetType;
    private String DBInstanceCPU;
    private String SecurityIPList;
    private ReadOnlyDBInstanceIdsEty ReadOnlyDBInstanceIds;

    private String SecurityIPMode;
    private String MaintainTime;
    private String DispenseMode;
    private String ZoneId;
    private String DBInstanceStorageType;
    private String AccountType;
    private int MaxIOPS;
    private String SupportUpgradeAccountType;
    private SlaveZonesEty SlaveZones;

    private ExtraEty Extra;

    private boolean CanTempUpgrade;
    private String RegionId;

    public RdsInstanceInfo() {
    }

    public int getDBInstanceMemory() {
        return DBInstanceMemory;
    }

    public void setDBInstanceMemory(int DBInstanceMemory) {
        this.DBInstanceMemory = DBInstanceMemory;
    }

    public String getResourceGroupId() {
        return ResourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        ResourceGroupId = resourceGroupId;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String port) {
        Port = port;
    }

    public String getLatestKernelVersion() {
        return LatestKernelVersion;
    }

    public void setLatestKernelVersion(String latestKernelVersion) {
        LatestKernelVersion = latestKernelVersion;
    }

    public String getDBInstanceType() {
        return DBInstanceType;
    }

    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    public String getInstanceNetworkType() {
        return InstanceNetworkType;
    }

    public void setInstanceNetworkType(String instanceNetworkType) {
        InstanceNetworkType = instanceNetworkType;
    }

    public String getDBInstanceClassType() {
        return DBInstanceClassType;
    }

    public void setDBInstanceClassType(String DBInstanceClassType) {
        this.DBInstanceClassType = DBInstanceClassType;
    }

    public String getDBInstanceId() {
        return DBInstanceId;
    }

    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    public String getAutoUpgradeMinorVersion() {
        return AutoUpgradeMinorVersion;
    }

    public void setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
        AutoUpgradeMinorVersion = autoUpgradeMinorVersion;
    }

    public int getDBInstanceStorage() {
        return DBInstanceStorage;
    }

    public void setDBInstanceStorage(int DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
    }

    public String getAvailabilityValue() {
        return AvailabilityValue;
    }

    public void setAvailabilityValue(String availabilityValue) {
        AvailabilityValue = availabilityValue;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getDBInstanceDescription() {
        return DBInstanceDescription;
    }

    public void setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
    }

    public String getIPType() {
        return IPType;
    }

    public void setIPType(String IPType) {
        this.IPType = IPType;
    }

    public long getDBInstanceDiskUsed() {
        return DBInstanceDiskUsed;
    }

    public void setDBInstanceDiskUsed(long DBInstanceDiskUsed) {
        this.DBInstanceDiskUsed = DBInstanceDiskUsed;
    }

    public String getEngineVersion() {
        return EngineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        EngineVersion = engineVersion;
    }

    public int getMaxConnections() {
        return MaxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        MaxConnections = maxConnections;
    }

    public String getDBInstanceStatus() {
        return DBInstanceStatus;
    }

    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    public String getSlaveConnectionString() {
        return SlaveConnectionString;
    }

    public void setSlaveConnectionString(String slaveConnectionString) {
        SlaveConnectionString = slaveConnectionString;
    }

    public String getDBInstanceClass() {
        return DBInstanceClass;
    }

    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    public int getAccountMaxQuantity() {
        return AccountMaxQuantity;
    }

    public void setAccountMaxQuantity(int accountMaxQuantity) {
        AccountMaxQuantity = accountMaxQuantity;
    }

    public String getVSwitchId() {
        return VSwitchId;
    }

    public void setVSwitchId(String VSwitchId) {
        this.VSwitchId = VSwitchId;
    }

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public String getLockMode() {
        return LockMode;
    }

    public void setLockMode(String lockMode) {
        LockMode = lockMode;
    }

    public String getSupportCreateSuperAccount() {
        return SupportCreateSuperAccount;
    }

    public void setSupportCreateSuperAccount(String supportCreateSuperAccount) {
        SupportCreateSuperAccount = supportCreateSuperAccount;
    }

    public int getInsId() {
        return InsId;
    }

    public void setInsId(int insId) {
        InsId = insId;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getCurrentKernelVersion() {
        return CurrentKernelVersion;
    }

    public void setCurrentKernelVersion(String currentKernelVersion) {
        CurrentKernelVersion = currentKernelVersion;
    }

    public String getConnectionMode() {
        return ConnectionMode;
    }

    public void setConnectionMode(String connectionMode) {
        ConnectionMode = connectionMode;
    }

    public String getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(String creationTime) {
        CreationTime = creationTime;
    }

    public String getVpcCloudInstanceId() {
        return VpcCloudInstanceId;
    }

    public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
        VpcCloudInstanceId = vpcCloudInstanceId;
    }

    public String getProxyType() {
        return ProxyType;
    }

    public void setProxyType(String proxyType) {
        ProxyType = proxyType;
    }

    public String getConnectionString() {
        return ConnectionString;
    }

    public void setConnectionString(String connectionString) {
        ConnectionString = connectionString;
    }

    public String getExpireTime() {
        return ExpireTime;
    }

    public void setExpireTime(String expireTime) {
        ExpireTime = expireTime;
    }

    public int getDBMaxQuantity() {
        return DBMaxQuantity;
    }

    public void setDBMaxQuantity(int DBMaxQuantity) {
        this.DBMaxQuantity = DBMaxQuantity;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDBInstanceNetType() {
        return DBInstanceNetType;
    }

    public void setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
    }

    public String getDBInstanceCPU() {
        return DBInstanceCPU;
    }

    public void setDBInstanceCPU(String DBInstanceCPU) {
        this.DBInstanceCPU = DBInstanceCPU;
    }

    public String getSecurityIPList() {
        return SecurityIPList;
    }

    public void setSecurityIPList(String securityIPList) {
        SecurityIPList = securityIPList;
    }

    public ReadOnlyDBInstanceIdsEty getReadOnlyDBInstanceIds() {
        return ReadOnlyDBInstanceIds;
    }

    public void setReadOnlyDBInstanceIds(ReadOnlyDBInstanceIdsEty readOnlyDBInstanceIds) {
        ReadOnlyDBInstanceIds = readOnlyDBInstanceIds;
    }

    public String getSecurityIPMode() {
        return SecurityIPMode;
    }

    public void setSecurityIPMode(String securityIPMode) {
        SecurityIPMode = securityIPMode;
    }

    public String getMaintainTime() {
        return MaintainTime;
    }

    public void setMaintainTime(String maintainTime) {
        MaintainTime = maintainTime;
    }

    public String getDispenseMode() {
        return DispenseMode;
    }

    public void setDispenseMode(String dispenseMode) {
        DispenseMode = dispenseMode;
    }

    public String getZoneId() {
        return ZoneId;
    }

    public void setZoneId(String zoneId) {
        ZoneId = zoneId;
    }

    public String getDBInstanceStorageType() {
        return DBInstanceStorageType;
    }

    public void setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public int getMaxIOPS() {
        return MaxIOPS;
    }

    public void setMaxIOPS(int maxIOPS) {
        MaxIOPS = maxIOPS;
    }

    public String getSupportUpgradeAccountType() {
        return SupportUpgradeAccountType;
    }

    public void setSupportUpgradeAccountType(String supportUpgradeAccountType) {
        SupportUpgradeAccountType = supportUpgradeAccountType;
    }

    public SlaveZonesEty getSlaveZones() {
        return SlaveZones;
    }

    public void setSlaveZones(SlaveZonesEty slaveZones) {
        SlaveZones = slaveZones;
    }

    public ExtraEty getExtra() {
        return Extra;
    }

    public void setExtra(ExtraEty extra) {
        Extra = extra;
    }

    public boolean isCanTempUpgrade() {
        return CanTempUpgrade;
    }

    public void setCanTempUpgrade(boolean canTempUpgrade) {
        CanTempUpgrade = canTempUpgrade;
    }

    public String getRegionId() {
        return RegionId;
    }

    public void setRegionId(String regionId) {
        RegionId = regionId;
    }
}
