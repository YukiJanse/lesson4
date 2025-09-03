package se.jensen.yuki.oop.exercise1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Yuki", 37, "Uppsala");
        person.introduce();
        System.out.println(person.getName());
        person.setName("Håkan");
        System.out.println(person.getName());

        System.out.println(person.getAge());
        person.setAge(40);
        System.out.println(person.getAge());

        System.out.println(person.getCity());
        person.setCity("Stockholm");
        System.out.println(person.getCity());
    }
}
