package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Andrey Ilich Vaschenkov");
        student.setGroup("2A");
        student.setAdmissionDate("01-JAN-2022");
        System.out.println("Student " + student.getFullName() + " iz gruppi No. " + student.getGroup()
                + " postupil " + student.getAdmissionDate());
    }
}
