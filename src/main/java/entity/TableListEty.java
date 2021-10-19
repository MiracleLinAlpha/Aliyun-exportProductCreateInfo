package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class TableListEty {
    private List<String> Table;

    public TableListEty() {
    }

    public List<String> getTable() {
        return Table;
    }

    public void setTable(List<String> table) {
        Table = table;
    }
}
