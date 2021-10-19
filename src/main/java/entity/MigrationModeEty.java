package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class MigrationModeEty {
    private boolean DataInitialization;
    private boolean DataSynchronization;
    private boolean StructureInitialization;

    public MigrationModeEty() {
    }

    public boolean isDataInitialization() {
        return DataInitialization;
    }

    public void setDataInitialization(boolean dataInitialization) {
        DataInitialization = dataInitialization;
    }

    public boolean isDataSynchronization() {
        return DataSynchronization;
    }

    public void setDataSynchronization(boolean dataSynchronization) {
        DataSynchronization = dataSynchronization;
    }

    public boolean isStructureInitialization() {
        return StructureInitialization;
    }

    public void setStructureInitialization(boolean structureInitialization) {
        StructureInitialization = structureInitialization;
    }
}
