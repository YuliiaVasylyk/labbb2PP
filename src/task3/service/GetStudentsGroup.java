package task3.service;

import task2.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class GetStudentsGroup {
    public static void displayStudentsGroupInOrder(final Group group) {
        final List<Student> students = group.getStudents();
        students.sort(Comparator.comparing(Student::getStudentName));
        students.forEach(System.out::println);
        System.out.println();
    }

    private static boolean checkIfSubjectSchedule(final StudySchedule studySchedule, final Subject subject) {
        return studySchedule.getSchedule().stream().anyMatch(e -> e.getSubject().equals(subject));
    }

    public static void displayAllStudentPerSubject(final University university, final Subject subject) {
        final List<Student> students = new ArrayList<>();
        for (final Group group : university.getGroups()) {
            students.addAll(group.getStudents()
                    .stream()
                    .filter(e -> checkIfSubjectSchedule(e.getStudySchedule(), subject))
                    .toList());
        }
        students.forEach(System.out::println);
        System.out.println();
    }
}

