package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class parametersEty {
    private String K8SMasterPolicyDocument;
    private String SLSProjectName;
    private String WorkerPeriod;
    private String ContainerCIDR;
    private String MasterSystemDiskCategory;
    private String ExecuteVersion;
    private String DockerVersion;
    private String WorkerDataDiskSize;
    private String ElasticSearchUser;
    private String Network;
    private String EipAddress;
    private String ImageId;
    private String UserCA;
    private String K8sWorkerPolicyDocument;
    private String MasterInstanceChargeType;
    private String KeyPair;
    private String WorkerInstanceChargeType;
    private String WorkerKeyPair;
    private String GPUFlags;
//    private String ALIYUNNoValue;

    private String VSwitchId;
    private String CloudMonitorVersion;
    private String MasterPeriodUnit;
    private String MasterAutoRenewPeriod;
    private String Eip;
    private String ElasticSearchHost;
    private String MasterDataDiskSize;
    private String VpcId;
    private String MasterAutoRenew;
    private String WorkerAutoRenewPeriod;
    private String RemoveInstanceIds;
    private String ProtectedInstances;
    private String MasterDataDisk;
    private String NatGatewayId;
    private String HealthCheckType;
    private String Key;
    private String SNatEntry;
//    private String ALIYUN::Region;

    private String WorkerInstanceType;
//    private String ALIYUN::StackName;

    private String AuditFlags;
    private String MasterImageId;
    private String MasterDataDiskDevice;
    private String WorkerPeriodUnit;
    private String MasterSystemDiskSize;
    private String WorkerDataDiskDevice;
    private String WillReplace;
    private String NatGateway;
    private String WorkerSystemDiskCategory;
    private String WorkerSystemDiskSize;
    private String LoggingType;
    private String MasterInstanceType;
    private String EtcdVersion;
    private String PublicSLB;
    private String WorkerImageId;
    private String WorkerLoginPassword;
    private String CloudMonitorFlags;
    private String ElasticSearchPass;
    private String BetaVersion;
    private String WorkerAutoRenew;
    private String CA;
    private String IPVSEnable;
    private String MasterLoginPassword;
    private String MasterPeriod;
    private String Password;
    private String KubernetesVersion;
    private String NodeCIDRMask;
    private String ZoneId;
    private String ElasticSearchPort;
    private String MasterDataDiskCategory;
//    private String ALIYUN::AccountId;

    private String MasterKeyPair;
    private String AdjustmentType;
    private String SSHFlags;
    private String SnatTableId;
    private String WorkerDataDisk;
//    private String ALIYUN::StackId;

    private String NumOfNodes;
    private String ClientCA;
    private String ServiceCIDR;
    private String WorkerDataDiskCategory;

    public parametersEty() {
    }

    public String getK8SMasterPolicyDocument() {
        return K8SMasterPolicyDocument;
    }

    public void setK8SMasterPolicyDocument(String k8SMasterPolicyDocument) {
        K8SMasterPolicyDocument = k8SMasterPolicyDocument;
    }

    public String getSLSProjectName() {
        return SLSProjectName;
    }

    public void setSLSProjectName(String SLSProjectName) {
        this.SLSProjectName = SLSProjectName;
    }

    public String getWorkerPeriod() {
        return WorkerPeriod;
    }

    public void setWorkerPeriod(String workerPeriod) {
        WorkerPeriod = workerPeriod;
    }

    public String getContainerCIDR() {
        return ContainerCIDR;
    }

    public void setContainerCIDR(String containerCIDR) {
        ContainerCIDR = containerCIDR;
    }

    public String getMasterSystemDiskCategory() {
        return MasterSystemDiskCategory;
    }

    public void setMasterSystemDiskCategory(String masterSystemDiskCategory) {
        MasterSystemDiskCategory = masterSystemDiskCategory;
    }

    public String getExecuteVersion() {
        return ExecuteVersion;
    }

    public void setExecuteVersion(String executeVersion) {
        ExecuteVersion = executeVersion;
    }

    public String getDockerVersion() {
        return DockerVersion;
    }

    public void setDockerVersion(String dockerVersion) {
        DockerVersion = dockerVersion;
    }

    public String getWorkerDataDiskSize() {
        return WorkerDataDiskSize;
    }

    public void setWorkerDataDiskSize(String workerDataDiskSize) {
        WorkerDataDiskSize = workerDataDiskSize;
    }

    public String getElasticSearchUser() {
        return ElasticSearchUser;
    }

    public void setElasticSearchUser(String elasticSearchUser) {
        ElasticSearchUser = elasticSearchUser;
    }

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String network) {
        Network = network;
    }

    public String getEipAddress() {
        return EipAddress;
    }

    public void setEipAddress(String eipAddress) {
        EipAddress = eipAddress;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    public String getUserCA() {
        return UserCA;
    }

    public void setUserCA(String userCA) {
        UserCA = userCA;
    }

    public String getK8sWorkerPolicyDocument() {
        return K8sWorkerPolicyDocument;
    }

    public void setK8sWorkerPolicyDocument(String k8sWorkerPolicyDocument) {
        K8sWorkerPolicyDocument = k8sWorkerPolicyDocument;
    }

    public String getMasterInstanceChargeType() {
        return MasterInstanceChargeType;
    }

    public void setMasterInstanceChargeType(String masterInstanceChargeType) {
        MasterInstanceChargeType = masterInstanceChargeType;
    }

    public String getKeyPair() {
        return KeyPair;
    }

    public void setKeyPair(String keyPair) {
        KeyPair = keyPair;
    }

    public String getWorkerInstanceChargeType() {
        return WorkerInstanceChargeType;
    }

    public void setWorkerInstanceChargeType(String workerInstanceChargeType) {
        WorkerInstanceChargeType = workerInstanceChargeType;
    }

    public String getWorkerKeyPair() {
        return WorkerKeyPair;
    }

    public void setWorkerKeyPair(String workerKeyPair) {
        WorkerKeyPair = workerKeyPair;
    }

    public String getGPUFlags() {
        return GPUFlags;
    }

    public void setGPUFlags(String GPUFlags) {
        this.GPUFlags = GPUFlags;
    }

    public String getVSwitchId() {
        return VSwitchId;
    }

    public void setVSwitchId(String VSwitchId) {
        this.VSwitchId = VSwitchId;
    }

    public String getCloudMonitorVersion() {
        return CloudMonitorVersion;
    }

    public void setCloudMonitorVersion(String cloudMonitorVersion) {
        CloudMonitorVersion = cloudMonitorVersion;
    }

    public String getMasterPeriodUnit() {
        return MasterPeriodUnit;
    }

    public void setMasterPeriodUnit(String masterPeriodUnit) {
        MasterPeriodUnit = masterPeriodUnit;
    }

    public String getMasterAutoRenewPeriod() {
        return MasterAutoRenewPeriod;
    }

    public void setMasterAutoRenewPeriod(String masterAutoRenewPeriod) {
        MasterAutoRenewPeriod = masterAutoRenewPeriod;
    }

    public String getEip() {
        return Eip;
    }

    public void setEip(String eip) {
        Eip = eip;
    }

    public String getElasticSearchHost() {
        return ElasticSearchHost;
    }

    public void setElasticSearchHost(String elasticSearchHost) {
        ElasticSearchHost = elasticSearchHost;
    }

    public String getMasterDataDiskSize() {
        return MasterDataDiskSize;
    }

    public void setMasterDataDiskSize(String masterDataDiskSize) {
        MasterDataDiskSize = masterDataDiskSize;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getMasterAutoRenew() {
        return MasterAutoRenew;
    }

    public void setMasterAutoRenew(String masterAutoRenew) {
        MasterAutoRenew = masterAutoRenew;
    }

    public String getWorkerAutoRenewPeriod() {
        return WorkerAutoRenewPeriod;
    }

    public void setWorkerAutoRenewPeriod(String workerAutoRenewPeriod) {
        WorkerAutoRenewPeriod = workerAutoRenewPeriod;
    }

    public String getRemoveInstanceIds() {
        return RemoveInstanceIds;
    }

    public void setRemoveInstanceIds(String removeInstanceIds) {
        RemoveInstanceIds = removeInstanceIds;
    }

    public String getProtectedInstances() {
        return ProtectedInstances;
    }

    public void setProtectedInstances(String protectedInstances) {
        ProtectedInstances = protectedInstances;
    }

    public String getMasterDataDisk() {
        return MasterDataDisk;
    }

    public void setMasterDataDisk(String masterDataDisk) {
        MasterDataDisk = masterDataDisk;
    }

    public String getNatGatewayId() {
        return NatGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        NatGatewayId = natGatewayId;
    }

    public String getHealthCheckType() {
        return HealthCheckType;
    }

    public void setHealthCheckType(String healthCheckType) {
        HealthCheckType = healthCheckType;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getSNatEntry() {
        return SNatEntry;
    }

    public void setSNatEntry(String SNatEntry) {
        this.SNatEntry = SNatEntry;
    }

    public String getWorkerInstanceType() {
        return WorkerInstanceType;
    }

    public void setWorkerInstanceType(String workerInstanceType) {
        WorkerInstanceType = workerInstanceType;
    }

    public String getAuditFlags() {
        return AuditFlags;
    }

    public void setAuditFlags(String auditFlags) {
        AuditFlags = auditFlags;
    }

    public String getMasterImageId() {
        return MasterImageId;
    }

    public void setMasterImageId(String masterImageId) {
        MasterImageId = masterImageId;
    }

    public String getMasterDataDiskDevice() {
        return MasterDataDiskDevice;
    }

    public void setMasterDataDiskDevice(String masterDataDiskDevice) {
        MasterDataDiskDevice = masterDataDiskDevice;
    }

    public String getWorkerPeriodUnit() {
        return WorkerPeriodUnit;
    }

    public void setWorkerPeriodUnit(String workerPeriodUnit) {
        WorkerPeriodUnit = workerPeriodUnit;
    }

    public String getMasterSystemDiskSize() {
        return MasterSystemDiskSize;
    }

    public void setMasterSystemDiskSize(String masterSystemDiskSize) {
        MasterSystemDiskSize = masterSystemDiskSize;
    }

    public String getWorkerDataDiskDevice() {
        return WorkerDataDiskDevice;
    }

    public void setWorkerDataDiskDevice(String workerDataDiskDevice) {
        WorkerDataDiskDevice = workerDataDiskDevice;
    }

    public String getWillReplace() {
        return WillReplace;
    }

    public void setWillReplace(String willReplace) {
        WillReplace = willReplace;
    }

    public String getNatGateway() {
        return NatGateway;
    }

    public void setNatGateway(String natGateway) {
        NatGateway = natGateway;
    }

    public String getWorkerSystemDiskCategory() {
        return WorkerSystemDiskCategory;
    }

    public void setWorkerSystemDiskCategory(String workerSystemDiskCategory) {
        WorkerSystemDiskCategory = workerSystemDiskCategory;
    }

    public String getWorkerSystemDiskSize() {
        return WorkerSystemDiskSize;
    }

    public void setWorkerSystemDiskSize(String workerSystemDiskSize) {
        WorkerSystemDiskSize = workerSystemDiskSize;
    }

    public String getLoggingType() {
        return LoggingType;
    }

    public void setLoggingType(String loggingType) {
        LoggingType = loggingType;
    }

    public String getMasterInstanceType() {
        return MasterInstanceType;
    }

    public void setMasterInstanceType(String masterInstanceType) {
        MasterInstanceType = masterInstanceType;
    }

    public String getEtcdVersion() {
        return EtcdVersion;
    }

    public void setEtcdVersion(String etcdVersion) {
        EtcdVersion = etcdVersion;
    }

    public String getPublicSLB() {
        return PublicSLB;
    }

    public void setPublicSLB(String publicSLB) {
        PublicSLB = publicSLB;
    }

    public String getWorkerImageId() {
        return WorkerImageId;
    }

    public void setWorkerImageId(String workerImageId) {
        WorkerImageId = workerImageId;
    }

    public String getWorkerLoginPassword() {
        return WorkerLoginPassword;
    }

    public void setWorkerLoginPassword(String workerLoginPassword) {
        WorkerLoginPassword = workerLoginPassword;
    }

    public String getCloudMonitorFlags() {
        return CloudMonitorFlags;
    }

    public void setCloudMonitorFlags(String cloudMonitorFlags) {
        CloudMonitorFlags = cloudMonitorFlags;
    }

    public String getElasticSearchPass() {
        return ElasticSearchPass;
    }

    public void setElasticSearchPass(String elasticSearchPass) {
        ElasticSearchPass = elasticSearchPass;
    }

    public String getBetaVersion() {
        return BetaVersion;
    }

    public void setBetaVersion(String betaVersion) {
        BetaVersion = betaVersion;
    }

    public String getWorkerAutoRenew() {
        return WorkerAutoRenew;
    }

    public void setWorkerAutoRenew(String workerAutoRenew) {
        WorkerAutoRenew = workerAutoRenew;
    }

    public String getCA() {
        return CA;
    }

    public void setCA(String CA) {
        this.CA = CA;
    }

    public String getIPVSEnable() {
        return IPVSEnable;
    }

    public void setIPVSEnable(String IPVSEnable) {
        this.IPVSEnable = IPVSEnable;
    }

    public String getMasterLoginPassword() {
        return MasterLoginPassword;
    }

    public void setMasterLoginPassword(String masterLoginPassword) {
        MasterLoginPassword = masterLoginPassword;
    }

    public String getMasterPeriod() {
        return MasterPeriod;
    }

    public void setMasterPeriod(String masterPeriod) {
        MasterPeriod = masterPeriod;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getKubernetesVersion() {
        return KubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
        KubernetesVersion = kubernetesVersion;
    }

    public String getNodeCIDRMask() {
        return NodeCIDRMask;
    }

    public void setNodeCIDRMask(String nodeCIDRMask) {
        NodeCIDRMask = nodeCIDRMask;
    }

    public String getZoneId() {
        return ZoneId;
    }

    public void setZoneId(String zoneId) {
        ZoneId = zoneId;
    }

    public String getElasticSearchPort() {
        return ElasticSearchPort;
    }

    public void setElasticSearchPort(String elasticSearchPort) {
        ElasticSearchPort = elasticSearchPort;
    }

    public String getMasterDataDiskCategory() {
        return MasterDataDiskCategory;
    }

    public void setMasterDataDiskCategory(String masterDataDiskCategory) {
        MasterDataDiskCategory = masterDataDiskCategory;
    }

    public String getMasterKeyPair() {
        return MasterKeyPair;
    }

    public void setMasterKeyPair(String masterKeyPair) {
        MasterKeyPair = masterKeyPair;
    }

    public String getAdjustmentType() {
        return AdjustmentType;
    }

    public void setAdjustmentType(String adjustmentType) {
        AdjustmentType = adjustmentType;
    }

    public String getSSHFlags() {
        return SSHFlags;
    }

    public void setSSHFlags(String SSHFlags) {
        this.SSHFlags = SSHFlags;
    }

    public String getSnatTableId() {
        return SnatTableId;
    }

    public void setSnatTableId(String snatTableId) {
        SnatTableId = snatTableId;
    }

    public String getWorkerDataDisk() {
        return WorkerDataDisk;
    }

    public void setWorkerDataDisk(String workerDataDisk) {
        WorkerDataDisk = workerDataDisk;
    }

    public String getNumOfNodes() {
        return NumOfNodes;
    }

    public void setNumOfNodes(String numOfNodes) {
        NumOfNodes = numOfNodes;
    }

    public String getClientCA() {
        return ClientCA;
    }

    public void setClientCA(String clientCA) {
        ClientCA = clientCA;
    }

    public String getServiceCIDR() {
        return ServiceCIDR;
    }

    public void setServiceCIDR(String serviceCIDR) {
        ServiceCIDR = serviceCIDR;
    }

    public String getWorkerDataDiskCategory() {
        return WorkerDataDiskCategory;
    }

    public void setWorkerDataDiskCategory(String workerDataDiskCategory) {
        WorkerDataDiskCategory = workerDataDiskCategory;
    }
}
