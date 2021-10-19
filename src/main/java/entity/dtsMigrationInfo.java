package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class dtsMigrationInfo {
    private PrecheckEty Precheck;

    private DataSynchronizationEty DataSynchronization;

    private String MigrationJobName;
    private String PayType;
    private MigrationModeEty MigrationMode;

    private String MigrationJobStatus;
    private String MigrationJobID;
    private MigrationObjectEty MigrationObject;

    private int Department;
    private DataInitializationEty DataInitialization;

    private DestinationEndpointEty DestinationEndpoint;

    private String MigrationJobClass;
    private SourceEndpointEty SourceEndpoint;

    private String DepartmentName;
    private StructureInitializationEty StructureInitialization;

    private int ResourceGroup;
    private String ResourceGroupName;


    public dtsMigrationInfo() {
    }

    public PrecheckEty getPrecheck() {
        return Precheck;
    }

    public void setPrecheck(PrecheckEty precheck) {
        Precheck = precheck;
    }

    public DataSynchronizationEty getDataSynchronization() {
        return DataSynchronization;
    }

    public void setDataSynchronization(DataSynchronizationEty dataSynchronization) {
        DataSynchronization = dataSynchronization;
    }

    public String getMigrationJobName() {
        return MigrationJobName;
    }

    public void setMigrationJobName(String migrationJobName) {
        MigrationJobName = migrationJobName;
    }

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public MigrationModeEty getMigrationMode() {
        return MigrationMode;
    }

    public void setMigrationMode(MigrationModeEty migrationMode) {
        MigrationMode = migrationMode;
    }

    public String getMigrationJobStatus() {
        return MigrationJobStatus;
    }

    public void setMigrationJobStatus(String migrationJobStatus) {
        MigrationJobStatus = migrationJobStatus;
    }

    public String getMigrationJobID() {
        return MigrationJobID;
    }

    public void setMigrationJobID(String migrationJobID) {
        MigrationJobID = migrationJobID;
    }

    public MigrationObjectEty getMigrationObject() {
        return MigrationObject;
    }

    public void setMigrationObject(MigrationObjectEty migrationObject) {
        MigrationObject = migrationObject;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public DataInitializationEty getDataInitialization() {
        return DataInitialization;
    }

    public void setDataInitialization(DataInitializationEty dataInitialization) {
        DataInitialization = dataInitialization;
    }

    public DestinationEndpointEty getDestinationEndpoint() {
        return DestinationEndpoint;
    }

    public void setDestinationEndpoint(DestinationEndpointEty destinationEndpoint) {
        DestinationEndpoint = destinationEndpoint;
    }

    public String getMigrationJobClass() {
        return MigrationJobClass;
    }

    public void setMigrationJobClass(String migrationJobClass) {
        MigrationJobClass = migrationJobClass;
    }

    public SourceEndpointEty getSourceEndpoint() {
        return SourceEndpoint;
    }

    public void setSourceEndpoint(SourceEndpointEty sourceEndpoint) {
        SourceEndpoint = sourceEndpoint;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public StructureInitializationEty getStructureInitialization() {
        return StructureInitialization;
    }

    public void setStructureInitialization(StructureInitializationEty structureInitialization) {
        StructureInitialization = structureInitialization;
    }

    public int getResourceGroup() {
        return ResourceGroup;
    }

    public void setResourceGroup(int resourceGroup) {
        ResourceGroup = resourceGroup;
    }

    public String getResourceGroupName() {
        return ResourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        ResourceGroupName = resourceGroupName;
    }
}
