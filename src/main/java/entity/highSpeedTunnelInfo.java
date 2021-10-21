package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class highSpeedTunnelInfo {
    private String DepartmentName;
    private String VpcInstanceId;
    private String OppositeDepartmentName;
    private String OppositeVpcInstanceId;
    private int Bandwidth;
    private String CreationTime;


    public highSpeedTunnelInfo() {
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

    public String getOppositeDepartmentName() {
        return OppositeDepartmentName;
    }

    public void setOppositeDepartmentName(String oppositeDepartmentName) {
        OppositeDepartmentName = oppositeDepartmentName;
    }

    public String getOppositeVpcInstanceId() {
        return OppositeVpcInstanceId;
    }

    public void setOppositeVpcInstanceId(String oppositeVpcInstanceId) {
        OppositeVpcInstanceId = oppositeVpcInstanceId;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        Bandwidth = bandwidth;
    }

    public String getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(String creationTime) {
        CreationTime = creationTime;
    }
}
