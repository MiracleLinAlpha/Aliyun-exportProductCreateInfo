package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class userInfo {
    private String cellphoneNum;
    private defaultRoleEty defaultRole;

    private String displayName;
    private boolean enableDingTalk;
    private List<rolesEty> roles;

    private loginPolicyEty loginPolicy;

    private String parentPk;
    private long lastLoginTime;
    private List<userGroupsEty> userGroups;

    private List<userRoleEty> userRoles;

    private boolean Default;
    private boolean deleted;
    private String loginName;
    private organizationEty organization;

    private List<userGroupRolesEty> userGroupRoles;

    private int id;
    private String mobileNationCode;
    private boolean enableEmail;
    private String email;
    private boolean enableShortMessage;
    private String primaryKey;
    private String status;

    public userInfo() {
    }

    public String getCellphoneNum() {
        return cellphoneNum;
    }

    public void setCellphoneNum(String cellphoneNum) {
        this.cellphoneNum = cellphoneNum;
    }

    public defaultRoleEty getDefaultRole() {
        return defaultRole;
    }

    public void setDefaultRole(defaultRoleEty defaultRole) {
        this.defaultRole = defaultRole;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isEnableDingTalk() {
        return enableDingTalk;
    }

    public void setEnableDingTalk(boolean enableDingTalk) {
        this.enableDingTalk = enableDingTalk;
    }

    public List<rolesEty> getRoles() {
        return roles;
    }

    public void setRoles(List<rolesEty> roles) {
        this.roles = roles;
    }

    public loginPolicyEty getLoginPolicy() {
        return loginPolicy;
    }

    public void setLoginPolicy(loginPolicyEty loginPolicy) {
        this.loginPolicy = loginPolicy;
    }

    public String getParentPk() {
        return parentPk;
    }

    public void setParentPk(String parentPk) {
        this.parentPk = parentPk;
    }

    public long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public List<userGroupsEty> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(List<userGroupsEty> userGroups) {
        this.userGroups = userGroups;
    }

    public List<userRoleEty> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<userRoleEty> userRoles) {
        this.userRoles = userRoles;
    }

    public boolean isDefault() {
        return Default;
    }

    public void setDefault(boolean aDefault) {
        Default = aDefault;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public organizationEty getOrganization() {
        return organization;
    }

    public void setOrganization(organizationEty organization) {
        this.organization = organization;
    }


    public List<userGroupRolesEty> getUserGroupRoles() {
        return userGroupRoles;
    }

    public void setUserGroupRoles(List<userGroupRolesEty> userGroupRoles) {
        this.userGroupRoles = userGroupRoles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobileNationCode() {
        return mobileNationCode;
    }

    public void setMobileNationCode(String mobileNationCode) {
        this.mobileNationCode = mobileNationCode;
    }

    public boolean isEnableEmail() {
        return enableEmail;
    }

    public void setEnableEmail(boolean enableEmail) {
        this.enableEmail = enableEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnableShortMessage() {
        return enableShortMessage;
    }

    public void setEnableShortMessage(boolean enableShortMessage) {
        this.enableShortMessage = enableShortMessage;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
