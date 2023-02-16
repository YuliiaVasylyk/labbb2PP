package task2;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

public class ScheduleItem {
    private List<LocalDate> dates;
    private Subject subject;

    public ScheduleItem(final List<LocalDate> dates, final Subject subject) {

        this.dates = dates;
        this.subject = subject;
    }

    public ScheduleItem(){

    }
    public List<LocalDate> getDates() {
        return dates;
    }

    public void setDates(final List<LocalDate> dates) {
        this.dates = dates;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(final Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "ScheduleItem{" +
                "dates=" + dates + '\'' +
                "name=" + subject.toString() + '\'' +
                '}';
    }

}
