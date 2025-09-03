package se.jensen.yuki.oop.exercise2;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12.5, 4.6);
        System.out.println("bredd: " + rect.getWidth() + " längd: " + rect.getLength() + ", Area: " + rect.area());
        rect.setWidth(-10.0);
        rect.setWidth(10.0);
        rect.setLength(-10.0);
        rect.setLength(10.0);
        System.out.println("bredd: " + rect.getWidth() + " längd: " + rect.getLength() + ", Area: " + rect.area());
    }
}
