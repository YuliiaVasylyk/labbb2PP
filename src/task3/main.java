package task3;

import task2.*;
import task2.University;
import task3.service.AddDateToSubject;
import task3.service.AddNewSubject;
import task3.service.GetStudentsGroup;

import java.time.LocalDate;

public class main {
    public static void main(final String[] args) {
        final University university = task2.create();
        System.out.println(university);
        final Subject sub = new Subject("Language");
        final AddNewSubject addNewSubject = new AddNewSubject(sub);
        addNewSubject.action(university.getGroups().get(0));
        System.out.println(university);

        final AddDateToSubject addDateToSubject = new AddDateToSubject(LocalDate.parse("2022-09-22"));
        addDateToSubject.action(sub, university.getGroups().get(0).getStudents().get(0).getStudySchedule());
        addDateToSubject.action(sub,  university.getGroups().get(0).getStudents().get(0).getStudySchedule());
        System.out.println(university);
        System.out.println();

        GetStudentsGroup.displayStudentsGroupInOrder(university.getGroups().get(1));
        final Subject subject = university
                .getGroups()
                .get(0).getStudents()
                .get(0).getStudySchedule()
                .getSchedule().get(2).getSubject();
        System.out.println(subject.getNameOfSubject());
        GetStudentsGroup.displayAllStudentPerSubject(university, subject);
    }
}

