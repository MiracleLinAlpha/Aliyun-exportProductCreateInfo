package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class slbInfo {
    private String Address;
    private String VSwitchId;
    private String CreateTime;
    private String LoadBalancerId;
    private String PayType;
    private String InternetChargeType;
    private String LoadBalancerSpec;
    private String RegionIdAlias;
    private String LoadBalancerName;
    private int Department;
    private String VpcId;
    private String NetworkType;
    private String DepartmentName;
    private String RegionId;
    private String AddressType;
    private String LoadBalancerStatus;
    private long CreateTimeStamp;
    private String MasterZoneId;
    private TagEty Tags;
    private String ResourceGroup;
    private String ResourceGroupName;


    public slbInfo() {
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
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

    public String getLoadBalancerId() {
        return LoadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        LoadBalancerId = loadBalancerId;
    }

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public String getInternetChargeType() {
        return InternetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        InternetChargeType = internetChargeType;
    }

    public String getLoadBalancerSpec() {
        return LoadBalancerSpec;
    }

    public void setLoadBalancerSpec(String loadBalancerSpec) {
        LoadBalancerSpec = loadBalancerSpec;
    }

    public String getRegionIdAlias() {
        return RegionIdAlias;
    }

    public void setRegionIdAlias(String regionIdAlias) {
        RegionIdAlias = regionIdAlias;
    }

    public String getLoadBalancerName() {
        return LoadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        LoadBalancerName = loadBalancerName;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getNetworkType() {
        return NetworkType;
    }

    public void setNetworkType(String networkType) {
        NetworkType = networkType;
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

    public String getAddressType() {
        return AddressType;
    }

    public void setAddressType(String addressType) {
        AddressType = addressType;
    }

    public String getLoadBalancerStatus() {
        return LoadBalancerStatus;
    }

    public void setLoadBalancerStatus(String loadBalancerStatus) {
        LoadBalancerStatus = loadBalancerStatus;
    }

    public long getCreateTimeStamp() {
        return CreateTimeStamp;
    }

    public void setCreateTimeStamp(long createTimeStamp) {
        CreateTimeStamp = createTimeStamp;
    }

    public String getMasterZoneId() {
        return MasterZoneId;
    }

    public void setMasterZoneId(String masterZoneId) {
        MasterZoneId = masterZoneId;
    }

    public TagEty getTags() {
        return Tags;
    }

    public void setTags(TagEty tags) {
        Tags = tags;
    }

    public String getResourceGroup() {
        return ResourceGroup;
    }

    public void setResourceGroup(String resourceGroup) {
        ResourceGroup = resourceGroup;
    }

    public String getResourceGroupName() {
        return ResourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        ResourceGroupName = resourceGroupName;
    }
}
