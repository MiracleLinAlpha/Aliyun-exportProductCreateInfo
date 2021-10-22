package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class MountTargetsEty {
    private List<MountTargetEty> MountTarget;

    public MountTargetsEty() {
    }

    public List<MountTargetEty> getMountTarget() {
        return MountTarget;
    }

    public void setMountTarget(List<MountTargetEty> mountTarget) {
        MountTarget = mountTarget;
    }
}
