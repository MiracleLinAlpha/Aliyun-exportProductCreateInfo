package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class upgrade_componentsEty {
    private KubernetesEty Kubernetes;

    public upgrade_componentsEty() {
    }

    public KubernetesEty getKubernetes() {
        return Kubernetes;
    }

    public void setKubernetes(KubernetesEty kubernetes) {
        Kubernetes = kubernetes;
    }
}
