package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class ReadOnlyDBInstanceIdsEty {
    private List<ReadOnlyDBInstanceIdEty> ReadOnlyDBInstanceId;

    public ReadOnlyDBInstanceIdsEty() {
    }

    public List<ReadOnlyDBInstanceIdEty> getReadOnlyDBInstanceId() {
        return ReadOnlyDBInstanceId;
    }

    public void setReadOnlyDBInstanceId(List<ReadOnlyDBInstanceIdEty> readOnlyDBInstanceId) {
        ReadOnlyDBInstanceId = readOnlyDBInstanceId;
    }
}
