package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class ReadOnlyDBInstanceIdsEty {
    private List<String> ReadOnlyDBInstanceId;

    public ReadOnlyDBInstanceIdsEty() {
    }

    public List<String> getReadOnlyDBInstanceId() {
        return ReadOnlyDBInstanceId;
    }

    public void setReadOnlyDBInstanceId(List<String> readOnlyDBInstanceId) {
        ReadOnlyDBInstanceId = readOnlyDBInstanceId;
    }
}
