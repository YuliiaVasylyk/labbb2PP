package task3.service;

import task2.*;
import task4.Journal;

public class AddGroupService {
    final private Group group;

    public AddGroupService() {
        group = new Group();
    }

    public void setGroupName(final String groupName) {
        group.setNameOfGroup(groupName);
    }

    public void addStudentState(final String fullName, final int age) {
        group.getStudents().add(new Student(fullName, age, new StudySchedule(), new Journal(), group));
    }

    public AddGroupService(final Group group) {
        this.group = group;
    }

    public void addToUniversity(final University university) {
        university.getGroups().add(group);
    }
}
