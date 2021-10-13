package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class SnapshotEty {

    private String Status;
    private String Progress;
    private String Usage;
    private String Description;
    private String Category;
    private String KMSKeyId;
    private String ProductCode;
    private boolean Encrypted;
    private int RetentionDays;
    private String SnapshotName;
    private String SourceDiskId;
    private String SourceStorageType;
    private String SnapshotSN;
    private String SnapshotId;
    private int Department;
    private int SourceDiskSize;
    private String CreationTime;
    private String LastModifiedTime;
    private String DepartmentName;
    private String SnapshotType;
    private String SourceDiskType;
    private TagsEty Tags;
    private int ResourceGroup;
    private String ResourceGroupName;


    public SnapshotEty() {
    }

    @Override
    public String toString() {
        return "SnapshotEty{" +
                "Status='" + Status + '\'' +
                ", Progress='" + Progress + '\'' +
                ", Usage='" + Usage + '\'' +
                ", Description='" + Description + '\'' +
                ", Category='" + Category + '\'' +
                ", KMSKeyId='" + KMSKeyId + '\'' +
                ", ProductCode='" + ProductCode + '\'' +
                ", Encrypted=" + Encrypted +
                ", RetentionDays=" + RetentionDays +
                ", SnapshotName='" + SnapshotName + '\'' +
                ", SourceDiskId='" + SourceDiskId + '\'' +
                ", SourceStorageType='" + SourceStorageType + '\'' +
                ", SnapshotSN='" + SnapshotSN + '\'' +
                ", SnapshotId='" + SnapshotId + '\'' +
                ", Department=" + Department +
                ", SourceDiskSize=" + SourceDiskSize +
                ", CreationTime='" + CreationTime + '\'' +
                ", LastModifiedTime='" + LastModifiedTime + '\'' +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", SnapshotType='" + SnapshotType + '\'' +
                ", SourceDiskType='" + SourceDiskType + '\'' +
                ", Tags=" + Tags +
                ", ResourceGroup=" + ResourceGroup +
                ", ResourceGroupName='" + ResourceGroupName + '\'' +
                '}';
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getProgress() {
        return Progress;
    }

    public void setProgress(String progress) {
        Progress = progress;
    }

    public String getUsage() {
        return Usage;
    }

    public void setUsage(String usage) {
        Usage = usage;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getKMSKeyId() {
        return KMSKeyId;
    }

    public void setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public boolean isEncrypted() {
        return Encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        Encrypted = encrypted;
    }

    public int getRetentionDays() {
        return RetentionDays;
    }

    public void setRetentionDays(int retentionDays) {
        RetentionDays = retentionDays;
    }

    public String getSnapshotName() {
        return SnapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        SnapshotName = snapshotName;
    }

    public String getSourceDiskId() {
        return SourceDiskId;
    }

    public void setSourceDiskId(String sourceDiskId) {
        SourceDiskId = sourceDiskId;
    }

    public String getSourceStorageType() {
        return SourceStorageType;
    }

    public void setSourceStorageType(String sourceStorageType) {
        SourceStorageType = sourceStorageType;
    }

    public String getSnapshotSN() {
        return SnapshotSN;
    }

    public void setSnapshotSN(String snapshotSN) {
        SnapshotSN = snapshotSN;
    }

    public String getSnapshotId() {
        return SnapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        SnapshotId = snapshotId;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public int getSourceDiskSize() {
        return SourceDiskSize;
    }

    public void setSourceDiskSize(int sourceDiskSize) {
        SourceDiskSize = sourceDiskSize;
    }

    public String getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(String creationTime) {
        CreationTime = creationTime;
    }

    public String getLastModifiedTime() {
        return LastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        LastModifiedTime = lastModifiedTime;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getSnapshotType() {
        return SnapshotType;
    }

    public void setSnapshotType(String snapshotType) {
        SnapshotType = snapshotType;
    }

    public String getSourceDiskType() {
        return SourceDiskType;
    }

    public void setSourceDiskType(String sourceDiskType) {
        SourceDiskType = sourceDiskType;
    }

    public TagsEty getTags() {
        return Tags;
    }

    public void setTags(TagsEty tags) {
        Tags = tags;
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
