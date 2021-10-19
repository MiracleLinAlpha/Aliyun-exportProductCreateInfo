package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class rolesEty {
    private String roleRange;
    private String arId;
    private boolean rAMRole;
    private String code;
    private boolean active;
    private String description;
    private String roleType;
    private boolean Default;
    private int ownerOrganizationId;
    private boolean enable;
    private String roleName;
    private int id;
    private long roleLevel;
    private String organizationVisibility;

    public rolesEty() {
    }

    public String getRoleRange() {
        return roleRange;
    }

    public void setRoleRange(String roleRange) {
        this.roleRange = roleRange;
    }

    public String getArId() {
        return arId;
    }

    public void setArId(String arId) {
        this.arId = arId;
    }

    public boolean isrAMRole() {
        return rAMRole;
    }

    public void setrAMRole(boolean rAMRole) {
        this.rAMRole = rAMRole;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public boolean isDefault() {
        return Default;
    }

    public void setDefault(boolean aDefault) {
        Default = aDefault;
    }

    public int getOwnerOrganizationId() {
        return ownerOrganizationId;
    }

    public void setOwnerOrganizationId(int ownerOrganizationId) {
        this.ownerOrganizationId = ownerOrganizationId;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(long roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getOrganizationVisibility() {
        return organizationVisibility;
    }

    public void setOrganizationVisibility(String organizationVisibility) {
        this.organizationVisibility = organizationVisibility;
    }
}
