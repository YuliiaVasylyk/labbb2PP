package task2;

import task4.Journal;

public class Student {
    private String studentName;
    private int age;
    private StudySchedule studySchedule;
    private Journal journal;
    private Group group;


    public Student(final String studentName, final int age, final StudySchedule studySchedule, final Journal journal, final Group group) {
        this.studentName = studentName;
        this.age = age;
        this.studySchedule = studySchedule;
        this.journal = journal;
        this.group = group;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(final String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public StudySchedule getStudySchedule() {
        return studySchedule;
    }

    public void setStudySchedule(final StudySchedule studySchedule) {
        this.studySchedule = studySchedule;
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(final Journal journal) {
        this.journal = journal;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(final Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                "schedule='" + studySchedule + '\'' +
                ", age=" + age +
                '}';
    }

}

