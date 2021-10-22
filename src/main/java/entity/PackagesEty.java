package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class PackagesEty {
    private List<String> Package;

    public PackagesEty() {
    }

    public List<String> getPackage() {
        return Package;
    }

    public void setPackage(List<String> aPackage) {
        Package = aPackage;
    }
}
