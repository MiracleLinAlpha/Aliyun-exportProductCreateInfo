package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class PrecheckStatusEty {
    private String Status;
    private String Percent;
    private List<DetailEty> Detail;

    public PrecheckStatusEty() {
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getPercent() {
        return Percent;
    }

    public void setPercent(String percent) {
        Percent = percent;
    }

    public List<DetailEty> getDetail() {
        return Detail;
    }

    public void setDetail(List<DetailEty> detail) {
        Detail = detail;
    }
}
