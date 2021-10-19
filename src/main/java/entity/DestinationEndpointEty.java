package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class DestinationEndpointEty {
    private String UserName;
    private String InstanceID;
    private String InstanceType;
    private String EngineName;

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
}
