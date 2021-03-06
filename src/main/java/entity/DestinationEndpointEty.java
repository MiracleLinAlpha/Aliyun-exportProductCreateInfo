package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class DestinationEndpointEty {
    private String UserName;
    private String InstanceID;
    private String InstanceType;
    private String EngineName;
    private String InstanceId;

    public DestinationEndpointEty() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getInstanceID() {
        return InstanceID;
    }

    public void setInstanceID(String instanceID) {
        InstanceID = instanceID;
    }

    public String getInstanceType() {
        return InstanceType;
    }

    public void setInstanceType(String instanceType) {
        InstanceType = instanceType;
    }

    public String getEngineName() {
        return EngineName;
    }

    public void setEngineName(String engineName) {
        EngineName = engineName;
    }

    public String getInstanceId() {
        return InstanceId;
    }

    public void setInstanceId(String instanceId) {
        InstanceId = instanceId;
    }

    @Override
    public String toString() {
        return "DestinationEndpointEty{" +
                "UserName='" + UserName + '\'' +
                ", InstanceID='" + InstanceID + '\'' +
                ", InstanceType='" + InstanceType + '\'' +
                ", EngineName='" + EngineName + '\'' +
                ", InstanceId='" + InstanceId + '\'' +
                '}';
    }
}
