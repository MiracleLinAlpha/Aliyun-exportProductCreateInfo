package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class outputsEty {
    private String Description;
    private String OutputKey;
    private String OutputValue;

    public outputsEty() {
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getOutputKey() {
        return OutputKey;
    }

    public void setOutputKey(String outputKey) {
        OutputKey = outputKey;
    }

    public String getOutputValue() {
        return OutputValue;
    }

    public void setOutputValue(String outputValue) {
        OutputValue = outputValue;
    }
}
