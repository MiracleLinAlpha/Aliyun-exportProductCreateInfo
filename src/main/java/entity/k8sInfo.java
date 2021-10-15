package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class k8sInfo {
    private List<outputsEty> outputs;

    private String resource_group_id;
    private boolean private_zone;
    private String vpc_id;
    private String network_mode;
    private String security_group_id;
    private String cluster_type;
    private String docker_version;
    private String data_disk_category;
    private String zone_id;
    private String cluster_id;
    private int Department;
    private String external_loadbalancer_id;
    private String meta_data;
    private String vswitch_id;
    private boolean swarm_mode;
    private String state;
    private int ResourceGroup;
    private String init_version;
    private String node_status;
    private boolean need_update_agent;
    private String created;
    private String deletion_protection;
    private String subnet_cidr;
    private String profile;
    private String region_id;
    private String master_url;
    private String current_version;
//    private String PayType;

    private String vswitch_cidr;
    private String gw_bridge;
    private String cluster_healthy;
    private int size;
    private int data_disk_size;
    private int port;
    private boolean enabled_migration;
    private String name;
    private String DepartmentName;
    private String updated;
    private String instance_type;
    private upgrade_componentsEty upgrade_components;

    private parametersEty parameters;

    private String ResourceGroupName;

    public k8sInfo() {
    }

    public List<outputsEty> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<outputsEty> outputs) {
        this.outputs = outputs;
    }

    public String getResource_group_id() {
        return resource_group_id;
    }

    public void setResource_group_id(String resource_group_id) {
        this.resource_group_id = resource_group_id;
    }

    public boolean isPrivate_zone() {
        return private_zone;
    }

    public void setPrivate_zone(boolean private_zone) {
        this.private_zone = private_zone;
    }

    public String getVpc_id() {
        return vpc_id;
    }

    public void setVpc_id(String vpc_id) {
        this.vpc_id = vpc_id;
    }

    public String getNetwork_mode() {
        return network_mode;
    }

    public void setNetwork_mode(String network_mode) {
        this.network_mode = network_mode;
    }

    public String getSecurity_group_id() {
        return security_group_id;
    }

    public void setSecurity_group_id(String security_group_id) {
        this.security_group_id = security_group_id;
    }

    public String getCluster_type() {
        return cluster_type;
    }

    public void setCluster_type(String cluster_type) {
        this.cluster_type = cluster_type;
    }

    public String getDocker_version() {
        return docker_version;
    }

    public void setDocker_version(String docker_version) {
        this.docker_version = docker_version;
    }

    public String getData_disk_category() {
        return data_disk_category;
    }

    public void setData_disk_category(String data_disk_category) {
        this.data_disk_category = data_disk_category;
    }

    public String getZone_id() {
        return zone_id;
    }

    public void setZone_id(String zone_id) {
        this.zone_id = zone_id;
    }

    public String getCluster_id() {
        return cluster_id;
    }

    public void setCluster_id(String cluster_id) {
        this.cluster_id = cluster_id;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public String getExternal_loadbalancer_id() {
        return external_loadbalancer_id;
    }

    public void setExternal_loadbalancer_id(String external_loadbalancer_id) {
        this.external_loadbalancer_id = external_loadbalancer_id;
    }

    public String getMeta_data() {
        return meta_data;
    }

    public void setMeta_data(String meta_data) {
        this.meta_data = meta_data;
    }

    public String getVswitch_id() {
        return vswitch_id;
    }

    public void setVswitch_id(String vswitch_id) {
        this.vswitch_id = vswitch_id;
    }

    public boolean isSwarm_mode() {
        return swarm_mode;
    }

    public void setSwarm_mode(boolean swarm_mode) {
        this.swarm_mode = swarm_mode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getResourceGroup() {
        return ResourceGroup;
    }

    public void setResourceGroup(int resourceGroup) {
        ResourceGroup = resourceGroup;
    }

    public String getInit_version() {
        return init_version;
    }

    public void setInit_version(String init_version) {
        this.init_version = init_version;
    }

    public String getNode_status() {
        return node_status;
    }

    public void setNode_status(String node_status) {
        this.node_status = node_status;
    }

    public boolean isNeed_update_agent() {
        return need_update_agent;
    }

    public void setNeed_update_agent(boolean need_update_agent) {
        this.need_update_agent = need_update_agent;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDeletion_protection() {
        return deletion_protection;
    }

    public void setDeletion_protection(String deletion_protection) {
        this.deletion_protection = deletion_protection;
    }

    public String getSubnet_cidr() {
        return subnet_cidr;
    }

    public void setSubnet_cidr(String subnet_cidr) {
        this.subnet_cidr = subnet_cidr;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id;
    }

    public String getMaster_url() {
        return master_url;
    }

    public void setMaster_url(String master_url) {
        this.master_url = master_url;
    }

    public String getCurrent_version() {
        return current_version;
    }

    public void setCurrent_version(String current_version) {
        this.current_version = current_version;
    }

    public String getVswitch_cidr() {
        return vswitch_cidr;
    }

    public void setVswitch_cidr(String vswitch_cidr) {
        this.vswitch_cidr = vswitch_cidr;
    }

    public String getGw_bridge() {
        return gw_bridge;
    }

    public void setGw_bridge(String gw_bridge) {
        this.gw_bridge = gw_bridge;
    }

    public String getCluster_healthy() {
        return cluster_healthy;
    }

    public void setCluster_healthy(String cluster_healthy) {
        this.cluster_healthy = cluster_healthy;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getData_disk_size() {
        return data_disk_size;
    }

    public void setData_disk_size(int data_disk_size) {
        this.data_disk_size = data_disk_size;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isEnabled_migration() {
        return enabled_migration;
    }

    public void setEnabled_migration(boolean enabled_migration) {
        this.enabled_migration = enabled_migration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getInstance_type() {
        return instance_type;
    }

    public void setInstance_type(String instance_type) {
        this.instance_type = instance_type;
    }

    public upgrade_componentsEty getUpgrade_components() {
        return upgrade_components;
    }

    public void setUpgrade_components(upgrade_componentsEty upgrade_components) {
        this.upgrade_components = upgrade_components;
    }

    public parametersEty getParameters() {
        return parameters;
    }

    public void setParameters(parametersEty parameters) {
        this.parameters = parameters;
    }

    public String getResourceGroupName() {
        return ResourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        ResourceGroupName = resourceGroupName;
    }
}
