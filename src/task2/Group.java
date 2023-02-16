package task2;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String nameOfGroup;
    private List<Student> Students;

    public Group() {
        Students = new ArrayList<Student>();
    }
    public Group(final String nameOfGroup, final List<Student> Students) {
        this.nameOfGroup = nameOfGroup;
        this.Students = Students;
    }
    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(final String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(final List<Student> Students) {
        this.Students = Students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "nameOfGroup='" + nameOfGroup + '\'' +
                ", Students=" + Students +
                '}';
    }
}
