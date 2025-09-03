package se.jensen.yuki.oop.exercise3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Yuki", 1234);
        Student student2 = new Student("Håkan", 1235);
        Student student3 = new Student("Emma", 1236);
        student1.setGrade(1);
        student2.setGrade(2);
        student3.setGrade(3);
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }
}
