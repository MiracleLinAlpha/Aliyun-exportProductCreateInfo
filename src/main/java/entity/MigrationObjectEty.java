package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class MigrationObjectEty {
    private List<SynchronousObjectEty> SynchronousObject;

    public MigrationObjectEty() {
    }

    public List<SynchronousObjectEty> getSynchronousObject() {
        return SynchronousObject;
    }

    public void setSynchronousObject(List<SynchronousObjectEty> synchronousObject) {
        SynchronousObject = synchronousObject;
    }
}
