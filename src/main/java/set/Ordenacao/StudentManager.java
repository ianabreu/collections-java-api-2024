package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    Set<Student> studentSet;

    public StudentManager() {
        this.studentSet = new HashSet<>();
    }
    public void addStudent(String name, Long registration, double average){
        studentSet.add(new Student(name, registration, average));
    }
    public void removeStudent(long registration) {
        if (!studentSet.isEmpty()) {
            studentSet.removeIf(student -> student.getRegistration() == registration);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public Set<Student> getAllStudents() {
        if (!studentSet.isEmpty()) {
            return this.studentSet;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public Set<Student> getStudentsByName() {
        return new TreeSet<>(studentSet);
    }
    public Set<Student> getStudentsByAvarage() {
        Set<Student> studentsByAvarage = new TreeSet<>(new CompareByAverage());
        studentsByAvarage.addAll(studentSet);
        return studentsByAvarage;
    }





    public static void main(String[] args) {
        try {
        StudentManager s = new StudentManager();
        s.addStudent("Maria", 80809540L, 8.5);
        s.addStudent("Fabio", 70809540L, 7.5);
        s.addStudent("Augusto", 60809540L, 6.5);
        //s.removeStudent(70809540L);

        //System.out.println(s.getStudentsByName());
        System.out.println(s.getStudentsByAvarage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
