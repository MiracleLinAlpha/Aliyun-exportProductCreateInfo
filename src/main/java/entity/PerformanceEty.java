package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class PerformanceEty {
    private String RPS;
    private String FLOW;

    public PerformanceEty() {
    }

    public String getRPS() {
        return RPS;
    }

    public void setRPS(String RPS) {
        this.RPS = RPS;
    }

    public String getFLOW() {
        return FLOW;
    }

    public void setFLOW(String FLOW) {
        this.FLOW = FLOW;
    }
}
