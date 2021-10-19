package entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class loginPolicyEty {
    private List<ipRangesEty> ipRanges;
    private String muserId;
    private boolean Default;
    private int ownerOrganizationId;
    private List<timeRangesEty> timeRanges;
    private boolean enable;
    private String name;
    private String rule;
    private int id;
    private String cuserId;
    private String lpId;
    private String organizationVisibility;

    public loginPolicyEty() {
    }

    public String getCuserId() {
        return cuserId;
    }

    public void setCuserId(String cuserId) {
        this.cuserId = cuserId;
    }

    public boolean isDefault() {
        return Default;
    }

    public void setDefault(boolean aDefault) {
        Default = aDefault;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ipRangesEty> getIpRanges() {
        return ipRanges;
    }

    public void setIpRanges(List<ipRangesEty> ipRanges) {
        this.ipRanges = ipRanges;
    }

    public String getMuserId() {
        return muserId;
    }

    public void setMuserId(String muserId) {
        this.muserId = muserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public List<timeRangesEty> getTimeRanges() {
        return timeRanges;
    }

    public void setTimeRanges(List<timeRangesEty> timeRanges) {
        this.timeRanges = timeRanges;
    }

    public int getOwnerOrganizationId() {
        return ownerOrganizationId;
    }

    public void setOwnerOrganizationId(int ownerOrganizationId) {
        this.ownerOrganizationId = ownerOrganizationId;
    }

    public String getLpId() {
        return lpId;
    }

    public void setLpId(String lpId) {
        this.lpId = lpId;
    }

    public String getOrganizationVisibility() {
        return organizationVisibility;
    }

    public void setOrganizationVisibility(String organizationVisibility) {
        this.organizationVisibility = organizationVisibility;
    }
}
