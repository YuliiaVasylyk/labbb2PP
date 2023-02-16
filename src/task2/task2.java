package task2;

import task4.Journal;
import task4.JournalItem;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task2 {
    public static University create() {
        final University university = new University();
        final StudySchedule studySchedule1 = new StudySchedule();
        final StudySchedule studySchedule2 = new StudySchedule();
        final Group group1 = new Group();
        group1.setNameOfGroup("IT-21");
        final Group group2 = new Group();
        group2.setNameOfGroup("KN-22");
        final Journal journal1 = new Journal();
        final Journal journal2 = new Journal();
        final Student student1 = new Student("Yuliia Vasylyk", 18, studySchedule1, journal2, group1);
        final Student student2 = new Student("Vasylyk Yuliia", 20, studySchedule2, journal1, group2);
        group1.setStudents(Stream.of(student1).collect(Collectors.toList()));
        group2.setStudents(Stream.of(student2).collect(Collectors.toList()));
        final Subject subject1 = new Subject("PE");
        final Subject subject2 = new Subject("Math");
        final Subject subject3 = new Subject("IT");
        final JournalItem journalItem1 = new JournalItem(subject1, 91);
        final JournalItem journalItem2 = new JournalItem(subject2, 78);
        final JournalItem journalItem3 = new JournalItem(subject3, 100);

        final JournalItem journalItem4 = new JournalItem(subject1, 98);
        final JournalItem journalItem5 = new JournalItem(subject2, 88);
        final JournalItem journalItem6 = new JournalItem(subject3, 100);
        journal1.setJournal(Stream.of(journalItem1, journalItem2, journalItem3).collect(Collectors.toList()));
        journal1.setStudent(student2);
        journal2.setJournal(Stream.of(journalItem4, journalItem5, journalItem6).collect(Collectors.toList()));
        journal2.setStudent(student1);
        studySchedule1.setSchedule(Stream.of(
                new ScheduleItem(Stream.of(LocalDate.of(2022, 2, 9)).collect(Collectors.toList()), subject1),
                new ScheduleItem(Stream.of(LocalDate.of(2022, 2, 10), LocalDate.of(2022, 2, 13)).collect(Collectors.toList()), subject2),
                new ScheduleItem(Stream.of(LocalDate.of(2022, 2, 9)).collect(Collectors.toList()), subject3)
        ).collect(Collectors.toList()));
        studySchedule2.setSchedule(Stream.of(
                new ScheduleItem(Stream.of(LocalDate.of(2022, 3, 3)).collect(Collectors.toList()), subject1),
                new ScheduleItem(Stream.of(LocalDate.of(2022, 3, 2), LocalDate.of(2022, 2, 18)).collect(Collectors.toList()), subject2)
        ).collect(Collectors.toList()));
        group1.getStudents().add(student2);

        university.getGroups().add(group2);
        university.getGroups().add(group1);

        return university;
    }

    public static void main(final String[] args) {
        final University university = create();
        System.out.println(university);
    }

}
