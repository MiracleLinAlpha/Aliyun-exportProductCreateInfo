package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class RouterInterfaceTypeEty {
    private String OppositeInterfaceStatus;
    private String OppositeInterfaceId;
    private String OppositeRouterId;
    private String Description;
    private String EndTime;
    private String RouterId;
    private String BusinessStatus;
    private String Name;
    private int Department;
    private String OppositeRouterType;
    private int OppositeBandwidth;
    private int Bandwidth;
    private String ConnectedTime;
    private int ResourceGroup;
    private String Status;
    private String OppositeInterfaceOwnerId;
    private String OppositeRegionId;
    private boolean HasReservationData;
    private boolean CrossBorder;
    private String OppositeInterfaceSpec;
    private String Role;
    private String OppositeVpcInstanceId;
    private String RouterType;
    private String ChargeType;
    private String CreationTime;
    private String DepartmentName;
    private String VpcInstanceId;
    private String OppositeInterfaceBusinessStatus;
    private String OppositeAccessPointId;
    private String Spec;
    private String RouterInterfaceId;
    private String HealthCheckTargetIp;
    private String ResourceGroupName;

    public RouterInterfaceTypeEty() {
    }

    public String getOppositeInterfaceStatus() {
        return OppositeInterfaceStatus;
    }

    public void setOppositeInterfaceStatus(String oppositeInterfaceStatus) {
        OppositeInterfaceStatus = oppositeInterfaceStatus;
    }

    public String getOppositeInterfaceId() {
        return OppositeInterfaceId;
    }

    public void setOppositeInterfaceId(String oppositeInterfaceId) {
        OppositeInterfaceId = oppositeInterfaceId;
    }

    public String getOppositeRouterId() {
        return OppositeRouterId;
    }

    public void setOppositeRouterId(String oppositeRouterId) {
        OppositeRouterId = oppositeRouterId;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getRouterId() {
        return RouterId;
    }

    public void setRouterId(String routerId) {
        RouterId = routerId;
    }

    public String getBusinessStatus() {
        return BusinessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        BusinessStatus = businessStatus;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public String getOppositeRouterType() {
        return OppositeRouterType;
    }

    public void setOppositeRouterType(String oppositeRouterType) {
        OppositeRouterType = oppositeRouterType;
    }

    public int getOppositeBandwidth() {
        return OppositeBandwidth;
    }

    public void setOppositeBandwidth(int oppositeBandwidth) {
        OppositeBandwidth = oppositeBandwidth;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        Bandwidth = bandwidth;
    }

    public String getConnectedTime() {
        return ConnectedTime;
    }

    public void setConnectedTime(String connectedTime) {
        ConnectedTime = connectedTime;
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

    public String getOppositeInterfaceOwnerId() {
        return OppositeInterfaceOwnerId;
    }

    public void setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
        OppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
    }

    public String getOppositeRegionId() {
        return OppositeRegionId;
    }

    public void setOppositeRegionId(String oppositeRegionId) {
        OppositeRegionId = oppositeRegionId;
    }

    public boolean isHasReservationData() {
        return HasReservationData;
    }

    public void setHasReservationData(boolean hasReservationData) {
        HasReservationData = hasReservationData;
    }

    public boolean isCrossBorder() {
        return CrossBorder;
    }

    public void setCrossBorder(boolean crossBorder) {
        CrossBorder = crossBorder;
    }

    public String getOppositeInterfaceSpec() {
        return OppositeInterfaceSpec;
    }

    public void setOppositeInterfaceSpec(String oppositeInterfaceSpec) {
        OppositeInterfaceSpec = oppositeInterfaceSpec;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getOppositeVpcInstanceId() {
        return OppositeVpcInstanceId;
    }

    public void setOppositeVpcInstanceId(String oppositeVpcInstanceId) {
        OppositeVpcInstanceId = oppositeVpcInstanceId;
    }

    public String getRouterType() {
        return RouterType;
    }

    public void setRouterType(String routerType) {
        RouterType = routerType;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public String getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(String creationTime) {
        CreationTime = creationTime;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getVpcInstanceId() {
        return VpcInstanceId;
    }

    public void setVpcInstanceId(String vpcInstanceId) {
        VpcInstanceId = vpcInstanceId;
    }

    public String getOppositeInterfaceBusinessStatus() {
        return OppositeInterfaceBusinessStatus;
    }

    public void setOppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
        OppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
    }

    public String getSpec() {
        return Spec;
    }

    public void setSpec(String spec) {
        Spec = spec;
    }

    public String getRouterInterfaceId() {
        return RouterInterfaceId;
    }

    public void setRouterInterfaceId(String routerInterfaceId) {
        RouterInterfaceId = routerInterfaceId;
    }

    public String getResourceGroupName() {
        return ResourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        ResourceGroupName = resourceGroupName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOppositeAccessPointId() {
        return OppositeAccessPointId;
    }

    public void setOppositeAccessPointId(String oppositeAccessPointId) {
        OppositeAccessPointId = oppositeAccessPointId;
    }

    public String getHealthCheckTargetIp() {
        return HealthCheckTargetIp;
    }

    public void setHealthCheckTargetIp(String healthCheckTargetIp) {
        HealthCheckTargetIp = healthCheckTargetIp;
    }

}
