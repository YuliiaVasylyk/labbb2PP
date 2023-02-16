package task2;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public University() {
        groups = new ArrayList<Group>();
    }

    public void setGroups(final List<Group> groups) {
        this.groups = groups;
    }

    public University(final List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "University{" +
                "groups=" + groups +
                '}';
    }
}
