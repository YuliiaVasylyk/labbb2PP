package task2;

import java.util.Objects;

public class Subject {
    private String nameOfSubject;

    public Subject(){

    }
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject subject)) return false;
        return nameOfSubject.equals(subject.nameOfSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSubject);
    }

    public Subject(final String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(final String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "nameOfSubject='" + nameOfSubject + '\'' +
                '}';
    }

}
