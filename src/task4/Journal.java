package task4;

import task2.Student;
import task2.Subject;
import task2.University;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Journal {
    private Student student;
    private List<JournalItem> journal;

    public Journal(final Student student, final List<JournalItem> journal) {
        this.student = student;
        this.journal = journal;
    }

    public void changeMark(final Subject subject, final int mark) {
        journal.stream()
                .filter(e -> e.getSubject().equals(subject))
                .findFirst()
                .ifPresent(journalItem -> journalItem.setMark(mark));
    }

    public List<Journal> getAllMarks(final University university) {
        final List<Student> allStudents = new ArrayList<>();
        university
                .getGroups()
                .forEach(e -> allStudents.addAll(e.getStudents()));
        final List<Journal> allJournal = new ArrayList<>();
        allStudents.forEach(e -> allJournal.add(e.getJournal()));
        return allJournal;
    }

    public List<JournalItem> marksOfSubject(final Subject subject, final University university) {
        final List<JournalItem> allJournalItems = new ArrayList<>();
        getAllMarks(university)
                .forEach(e -> allJournalItems.addAll(e.journal));
        return allJournalItems
                .stream()
                .filter(e -> e.getSubject().equals(subject))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        final StringBuilder string = new StringBuilder();
        string.append(student.getStudentName());
        string.append(" { ");
        journal.forEach(e -> string.append(e).append(" "));
        string.append("}");
        return string.toString();
    }

    public Journal() {

    }

    public List<JournalItem> getJournal() {
        return journal;
    }

    public void setJournal(final List<JournalItem> journal) {
        this.journal = journal;
    }

    public Journal(final Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(final Student student) {
        this.student = student;
    }
}

