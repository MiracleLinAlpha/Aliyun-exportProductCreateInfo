package entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;
import java.util.List;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)

public class orderOrgTree {

    private int firstOrgNum;
    private List<Integer> children;

    public orderOrgTree() {
        children = new ArrayList<>();
    }

    public int getFirstOrgNum() {
        return firstOrgNum;
    }

    public void setFirstOrgNum(int firstOrgNum) {
        this.firstOrgNum = firstOrgNum;
    }

    public List<Integer> getChildren() {
        return children;
    }

    public void setChildren(int childrenNum) {
        children.add(childrenNum);
    }
}
