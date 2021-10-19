package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class dtsSynchronizationInfo {
    private String Status;
    private List<SynchronizationObjectsEty> SynchronizationObjects;

    private DataInitializationStatusEty DataInitializationStatus;

    private String SynchronizationJobName;
    private String PayType;
    private String Delay;
    private PrecheckStatusEty PrecheckStatus;

    private String SynchronizationJobId;
    private int Department;
    private boolean DataInitialization;
    private DestinationEndpointEty DestinationEndpoint;

    private DestinationEndpointEty SourceEndpoint;

    private String DepartmentName;
    private boolean StructureInitialization;
    private PerformanceEty Performance;

    private String SynchronizationJobClass;
    private int ResourceGroup;
    private StructureInitializationStatusEty StructureInitializationStatus;

    private DataSynchronizationStatusEty DataSynchronizationStatus;

    private String ResourceGroupName;


    public dtsSynchronizationInfo() {
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public List<SynchronizationObjectsEty> getSynchronizationObjects() {
        return SynchronizationObjects;
    }

    public void setSynchronizationObjects(List<SynchronizationObjectsEty> synchronizationObjects) {
        SynchronizationObjects = synchronizationObjects;
    }

    public DataInitializationStatusEty getDataInitializationStatus() {
        return DataInitializationStatus;
    }

    public void setDataInitializationStatus(DataInitializationStatusEty dataInitializationStatus) {
        DataInitializationStatus = dataInitializationStatus;
    }

    public String getSynchronizationJobName() {
        return SynchronizationJobName;
    }

    public void setSynchronizationJobName(String synchronizationJobName) {
        SynchronizationJobName = synchronizationJobName;
    }

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public String getDelay() {
        return Delay;
    }

    public void setDelay(String delay) {
        Delay = delay;
    }

    public PrecheckStatusEty getPrecheckStatus() {
        return PrecheckStatus;
    }

    public void setPrecheckStatus(PrecheckStatusEty precheckStatus) {
        PrecheckStatus = precheckStatus;
    }

    public String getSynchronizationJobId() {
        return SynchronizationJobId;
    }

    public void setSynchronizationJobId(String synchronizationJobId) {
        SynchronizationJobId = synchronizationJobId;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public boolean isDataInitialization() {
        return DataInitialization;
    }

    public void setDataInitialization(boolean dataInitialization) {
        DataInitialization = dataInitialization;
    }

    public DestinationEndpointEty getDestinationEndpoint() {
        return DestinationEndpoint;
    }

    public void setDestinationEndpoint(DestinationEndpointEty destinationEndpoint) {
        DestinationEndpoint = destinationEndpoint;
    }

    public DestinationEndpointEty getSourceEndpoint() {
        return SourceEndpoint;
    }

    public void setSourceEndpoint(DestinationEndpointEty sourceEndpoint) {
        SourceEndpoint = sourceEndpoint;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public boolean isStructureInitialization() {
        return StructureInitialization;
    }

    public void setStructureInitialization(boolean structureInitialization) {
        StructureInitialization = structureInitialization;
    }

    public PerformanceEty getPerformance() {
        return Performance;
    }

    public void setPerformance(PerformanceEty performance) {
        Performance = performance;
    }

    public String getSynchronizationJobClass() {
        return SynchronizationJobClass;
    }

    public void setSynchronizationJobClass(String synchronizationJobClass) {
        SynchronizationJobClass = synchronizationJobClass;
    }

    public int getResourceGroup() {
        return ResourceGroup;
    }

    public void setResourceGroup(int resourceGroup) {
        ResourceGroup = resourceGroup;
    }

    public StructureInitializationStatusEty getStructureInitializationStatus() {
        return StructureInitializationStatus;
    }

    public void setStructureInitializationStatus(StructureInitializationStatusEty structureInitializationStatus) {
        StructureInitializationStatus = structureInitializationStatus;
    }

    public DataSynchronizationStatusEty getDataSynchronizationStatus() {
        return DataSynchronizationStatus;
    }

    public void setDataSynchronizationStatus(DataSynchronizationStatusEty dataSynchronizationStatus) {
        DataSynchronizationStatus = dataSynchronizationStatus;
    }

    public String getResourceGroupName() {
        return ResourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        ResourceGroupName = resourceGroupName;
    }
}
