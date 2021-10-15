package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class DBInstanceIdEty {
    private List<String> DBInstanceId;

    public DBInstanceIdEty() {
    }

    public List<String> getDBInstanceId() {
        return DBInstanceId;
    }

    public void setDBInstanceId(List<String> DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }
}
