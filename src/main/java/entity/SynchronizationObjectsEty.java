package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class SynchronizationObjectsEty {
    private List<TableIncludeEty> TableIncludes;
    private List<String> TableExcludes;
    private String SchemaName;
    private String NewSchemaName;

    public SynchronizationObjectsEty() {
    }

    public List<TableIncludeEty> getTableIncludes() {
        return TableIncludes;
    }

    public void setTableIncludes(List<TableIncludeEty> tableIncludes) {
        TableIncludes = tableIncludes;
    }

    public List<String> getTableExcludes() {
        return TableExcludes;
    }

    public void setTableExcludes(List<String> tableExcludes) {
        TableExcludes = tableExcludes;
    }

    public String getSchemaName() {
        return SchemaName;
    }

    public void setSchemaName(String schemaName) {
        SchemaName = schemaName;
    }

    public String getNewSchemaName() {
        return NewSchemaName;
    }

    public void setNewSchemaName(String newSchemaName) {
        NewSchemaName = newSchemaName;
    }
}
