package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class ExtraEty {
    private DBInstanceIdEty DBInstanceId;

    public ExtraEty() {
    }

    public DBInstanceIdEty getDBInstanceId() {
        return DBInstanceId;
    }

    public void setDBInstanceId(DBInstanceIdEty DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }
}
