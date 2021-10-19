package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class SynchronousObjectEty {
    private String DatabaseName;
    private boolean WholeDatabase;
    private TableListEty TableList;

    public SynchronousObjectEty() {
    }

    public String getDatabaseName() {
        return DatabaseName;
    }

    public void setDatabaseName(String databaseName) {
        DatabaseName = databaseName;
    }

    public boolean isWholeDatabase() {
        return WholeDatabase;
    }

    public void setWholeDatabase(boolean wholeDatabase) {
        WholeDatabase = wholeDatabase;
    }

    public TableListEty getTableList() {
        return TableList;
    }

    public void setTableList(TableListEty tableList) {
        TableList = tableList;
    }
}
