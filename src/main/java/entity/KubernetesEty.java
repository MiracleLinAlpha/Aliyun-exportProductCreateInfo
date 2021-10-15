package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class KubernetesEty {
    private boolean exist;
    private String component_name;
    private boolean can_upgrade;
    private boolean force;
    private String ready_to_upgrade;
    private String message;
    private String version;
    private boolean required;
    private String next_version;
    private String changed;
    private String policy;


    public KubernetesEty() {
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public String getComponent_name() {
        return component_name;
    }

    public void setComponent_name(String component_name) {
        this.component_name = component_name;
    }

    public boolean isCan_upgrade() {
        return can_upgrade;
    }

    public void setCan_upgrade(boolean can_upgrade) {
        this.can_upgrade = can_upgrade;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }

    public String getReady_to_upgrade() {
        return ready_to_upgrade;
    }

    public void setReady_to_upgrade(String ready_to_upgrade) {
        this.ready_to_upgrade = ready_to_upgrade;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getNext_version() {
        return next_version;
    }

    public void setNext_version(String next_version) {
        this.next_version = next_version;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }
}
