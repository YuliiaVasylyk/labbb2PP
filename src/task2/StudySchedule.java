package task2;

import java.util.ArrayList;
import java.util.List;


public class StudySchedule {
    private List<ScheduleItem> schedule;

    public StudySchedule() {
        schedule = new ArrayList<ScheduleItem>();
    }

    @Override
    public String toString() {
        return schedule.toString();
    }

    public StudySchedule(final List<ScheduleItem> schedule) {
        this.schedule = schedule;
    }

    public List<ScheduleItem> getSchedule() {
        return schedule;
    }

    public void setSchedule(final List<ScheduleItem> schedule) {
        this.schedule = schedule;
    }
}

