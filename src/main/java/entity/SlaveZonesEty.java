package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class SlaveZonesEty {
    private List<String> SlaveZone;

    public SlaveZonesEty() {
    }

    public List<String> getSlaveZone() {
        return SlaveZone;
    }

    public void setSlaveZone(List<String> slaveZone) {
        SlaveZone = slaveZone;
    }
}
