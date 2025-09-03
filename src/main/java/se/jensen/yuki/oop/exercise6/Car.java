package se.jensen.yuki.oop.exercise6;

public class Car {
    private int speed = 0;
    private boolean started = false;

    public int getSpeed() {
        return speed;
    }

    public void start() {
        started = true;
    }

    public void accelerate(int acceleration) {
        if (started) {
            speed += acceleration;
        } else {
            System.out.println("Bilen har inte startat");
        }
    }

    public void stop() {
        if (isMoving()) {
            speed = 0;
            started = false;
        } else {
            System.out.println("Bilen står stilla");
        }
    }

    private boolean isMoving() {
        return speed > 0;
    }
}
