package task3.service;

import task2.StudySchedule;
import task2.Subject;

import java.time.LocalDate;

public class AddDateToSubject {
    final private LocalDate date;

    public AddDateToSubject(final LocalDate date) {
        this.date = date;
    }

    public void action(final Subject subject, final StudySchedule schedule) {
        schedule.getSchedule().stream()
                .filter(e -> e.getSubject().equals(subject))
                .findFirst().get().getDates().add(date);
    }
}

