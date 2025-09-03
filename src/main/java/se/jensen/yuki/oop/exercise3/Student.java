package se.jensen.yuki.oop.exercise3;

public class Student {
    private String name;
    private int studentId;
    private int grade;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name + " Student ID: " + studentId + ", Grade: " + grade);
    }
}
