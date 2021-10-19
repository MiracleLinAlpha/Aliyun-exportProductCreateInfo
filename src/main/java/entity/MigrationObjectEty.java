package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class MigrationObjectEty {
    private SynchronousObjectEty SynchronousObject;

    public MigrationObjectEty() {
    }

    public SynchronousObjectEty getSynchronousObject() {
        return SynchronousObject;
    }

    public void setSynchronousObject(SynchronousObjectEty synchronousObject) {
        SynchronousObject = synchronousObject;
    }
}
