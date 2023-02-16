package task4;

import task2.Subject;

public class JournalItem {
    private Subject subject;
    private int mark;

    public JournalItem() {

    }
    public JournalItem(final Subject subject, final int mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(final Subject subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(final int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return subject.getNameOfSubject() + ": " + mark;
    }
}
