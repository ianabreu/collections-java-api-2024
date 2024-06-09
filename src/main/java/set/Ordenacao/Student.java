package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private long registration;
    private double average;

    public Student(String name, long registration, double average) {
        this.name = name;
        this.registration = registration;
        this.average = average;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getRegistration() == student.getRegistration();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRegistration());
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                ", average=" + average +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRegistration() {
        return registration;
    }

    public void setRegistration(long registration) {
        this.registration = registration;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int compareTo(Student s) {
        return name.compareToIgnoreCase(s.getName());
    }
}

class CompareByAverage implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAverage(), s2.getAverage());
    }
}