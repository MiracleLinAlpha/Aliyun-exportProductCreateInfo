package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class SourceEndpointEty {
    private String UserName;
    private String Port;
    private String IP;
    private String InstanceType;
    private String EngineName;

    public SourceEndpointEty() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String port) {
        Port = port;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
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
