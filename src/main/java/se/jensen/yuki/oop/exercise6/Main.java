package se.jensen.yuki.oop.exercise6;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.accelerate(40);
        System.out.println("Speed: " + myCar.getSpeed());
        myCar.start();
        myCar.accelerate(40);
        System.out.println("Speed: " + myCar.getSpeed());
        myCar.accelerate(40);
        System.out.println("Speed: " + myCar.getSpeed());
        myCar.stop();
        myCar.stop();
        myCar.accelerate(40);
        System.out.println("Speed: " + myCar.getSpeed());

    }
}
