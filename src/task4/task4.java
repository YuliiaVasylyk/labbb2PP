package task4;

import task2.University;
import task2.*;
public class task4 {
    public static void main(final String[] args) {
        final University university = task2.create();
        final Student student = university.getGroups().get(1).getStudents().get(1);
        final Subject subject = university.getGroups().get(1).getStudents().get(1).getStudySchedule().getSchedule().get(0).getSubject();
        final Journal journal = new Journal(student, student.getJournal().getJournal());
        System.out.println(journal);
        journal.changeMark(subject, 4);
        System.out.println(journal);
        System.out.println();
        journal.getAllMarks(university).forEach(System.out::println);
        System.out.println();
        journal.marksOfSubject(subject, university).forEach(System.out::println);
    }
}
