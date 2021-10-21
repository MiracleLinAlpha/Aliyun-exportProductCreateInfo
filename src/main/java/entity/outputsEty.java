package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class outputsEty {
    private String Description;
    private String OutputKey;
    private List<String> OutputValues;
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

    public List<String> getOutputValues() {
        return OutputValues;
    }

    public void setOutputValues(List<String> outputValues) {
        OutputValues = outputValues;
    }

    public String getOutputValue() {
        return OutputValue;
    }

    public void setOutputValue(String outputValue) {
        OutputValue = outputValue;
    }
}
