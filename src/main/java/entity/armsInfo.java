package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class armsInfo {
    private boolean needUpgrade;
    private float rt;
    private applicationEty application;

    private float count;
    private String nameSpaceId;
    private float dataAvg;
    private float error;
    private String type;
    private List<String> labels;
    private int status;

    private String orgName;

    public armsInfo() {
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public boolean isNeedUpgrade() {
        return needUpgrade;
    }

    public void setNeedUpgrade(boolean needUpgrade) {
        this.needUpgrade = needUpgrade;
    }

    public float getRt() {
        return rt;
    }

    public void setRt(float rt) {
        this.rt = rt;
    }

    public applicationEty getApplication() {
        return application;
    }

    public void setApplication(applicationEty application) {
        this.application = application;
    }

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count = count;
    }

    public String getNameSpaceId() {
        return nameSpaceId;
    }

    public void setNameSpaceId(String nameSpaceId) {
        this.nameSpaceId = nameSpaceId;
    }

    public float getDataAvg() {
        return dataAvg;
    }

    public void setDataAvg(float dataAvg) {
        this.dataAvg = dataAvg;
    }

    public float getError() {
        return error;
    }

    public void setError(float error) {
        this.error = error;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
