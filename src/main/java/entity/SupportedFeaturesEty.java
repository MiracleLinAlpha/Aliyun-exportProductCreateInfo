package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class SupportedFeaturesEty {
    private List<String> SupportedFeature;

    public SupportedFeaturesEty() {
    }

    public List<String> getSupportedFeature() {
        return SupportedFeature;
    }

    public void setSupportedFeature(List<String> supportedFeature) {
        SupportedFeature = supportedFeature;
    }
}
