package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class ReadOnlyDBInstanceIdEty {
    private String DBInstanceId;

    public ReadOnlyDBInstanceIdEty() {
    }

    public String getDBInstanceId() {
        return DBInstanceId;
    }

    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }
}
