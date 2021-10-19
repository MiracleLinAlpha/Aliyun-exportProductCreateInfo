package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class DetailEty {
    private String CheckStatus;
    private String ItemName;

    public DetailEty() {
    }

    public String getCheckStatus() {
        return CheckStatus;
    }

    public void setCheckStatus(String checkStatus) {
        CheckStatus = checkStatus;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }
}
