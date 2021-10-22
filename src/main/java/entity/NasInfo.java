package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class NasInfo {
    private String Description;
    private int MountTargetCountLimit;
    private long MeteredSize;
    private int Department;
    private PackagesEty Packages;

    private String ExpiredTime;
    private String FileSystemId;
    private long VolumeSize;
    private int ResourceGroup;
    private String Status;
    private String StorageType;
    private String ZoneId;
    private String NasNamespaceId;
    private SupportedFeaturesEty SupportedFeatures;

    private int MeteredIASize;
    private String CreateTime;
    private MountTargetsEty MountTargets;

    private String AutoSnapshotPolicyId;
    private long QuotaSize;
    private int EncryptType;
    private String ChargeType;
    private String ProtocolType;
    private String FileSystemType;
    private String DepartmentName;
    private String RegionId;
    private String ResourceGroupName;

    public NasInfo() {
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getMountTargetCountLimit() {
        return MountTargetCountLimit;
    }

    public void setMountTargetCountLimit(int mountTargetCountLimit) {
        MountTargetCountLimit = mountTargetCountLimit;
    }

    public long getMeteredSize() {
        return MeteredSize;
    }

    public void setMeteredSize(long meteredSize) {
        MeteredSize = meteredSize;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public PackagesEty getPackages() {
        return Packages;
    }

    public void setPackages(PackagesEty packages) {
        Packages = packages;
    }

    public String getExpiredTime() {
        return ExpiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        ExpiredTime = expiredTime;
    }

    public String getFileSystemId() {
        return FileSystemId;
    }

    public void setFileSystemId(String fileSystemId) {
        FileSystemId = fileSystemId;
    }

    public long getVolumeSize() {
        return VolumeSize;
    }

    public void setVolumeSize(long volumeSize) {
        VolumeSize = volumeSize;
    }

    public int getResourceGroup() {
        return ResourceGroup;
    }

    public void setResourceGroup(int resourceGroup) {
        ResourceGroup = resourceGroup;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getStorageType() {
        return StorageType;
    }

    public void setStorageType(String storageType) {
        StorageType = storageType;
    }

    public String getZoneId() {
        return ZoneId;
    }

    public void setZoneId(String zoneId) {
        ZoneId = zoneId;
    }

    public String getNasNamespaceId() {
        return NasNamespaceId;
    }

    public void setNasNamespaceId(String nasNamespaceId) {
        NasNamespaceId = nasNamespaceId;
    }

    public SupportedFeaturesEty getSupportedFeatures() {
        return SupportedFeatures;
    }

    public void setSupportedFeatures(SupportedFeaturesEty supportedFeatures) {
        SupportedFeatures = supportedFeatures;
    }

    public int getMeteredIASize() {
        return MeteredIASize;
    }

    public void setMeteredIASize(int meteredIASize) {
        MeteredIASize = meteredIASize;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public MountTargetsEty getMountTargets() {
        return MountTargets;
    }

    public void setMountTargets(MountTargetsEty mountTargets) {
        MountTargets = mountTargets;
    }

    public String getAutoSnapshotPolicyId() {
        return AutoSnapshotPolicyId;
    }

    public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        AutoSnapshotPolicyId = autoSnapshotPolicyId;
    }

    public long getQuotaSize() {
        return QuotaSize;
    }

    public void setQuotaSize(long quotaSize) {
        QuotaSize = quotaSize;
    }

    public int getEncryptType() {
        return EncryptType;
    }

    public void setEncryptType(int encryptType) {
        EncryptType = encryptType;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public String getProtocolType() {
        return ProtocolType;
    }

    public void setProtocolType(String protocolType) {
        ProtocolType = protocolType;
    }

    public String getFileSystemType() {
        return FileSystemType;
    }

    public void setFileSystemType(String fileSystemType) {
        FileSystemType = fileSystemType;
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
