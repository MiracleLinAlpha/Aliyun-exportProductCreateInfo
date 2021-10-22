package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class MountTargetEty {
    private String Status;
    private String VswId;
    private String VpcId;
    private String MountTargetDomain;
    private String NetworkType;
    private String AccessGroupName;
    private TagsEty Tags;

    public MountTargetEty() {
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getVswId() {
        return VswId;
    }

    public void setVswId(String vswId) {
        VswId = vswId;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getMountTargetDomain() {
        return MountTargetDomain;
    }

    public void setMountTargetDomain(String mountTargetDomain) {
        MountTargetDomain = mountTargetDomain;
    }

    public String getNetworkType() {
        return NetworkType;
    }

    public void setNetworkType(String networkType) {
        NetworkType = networkType;
    }

    public String getAccessGroupName() {
        return AccessGroupName;
    }

    public void setAccessGroupName(String accessGroupName) {
        AccessGroupName = accessGroupName;
    }

    public TagsEty getTags() {
        return Tags;
    }

    public void setTags(TagsEty tags) {
        Tags = tags;
    }
}
