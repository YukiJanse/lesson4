package se.jensen.yuki.oop.exercise2;

public class Rectangle {
    private double width = 1;
    private double length = 1;

    public Rectangle(double width, double length) {
        // avoid setting values if one of the values is negative
        setWidth(width);
        setLength(length);
        System.out.println("Rectangle skapats");
    }

    public void setWidth(double width) {
        // avoid setting values if one of the values is negative
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Ogiltig värde");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        // avoid setting values if one of the values is negative
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Ogiltig värde");
        }
    }

    public double getLength() {
        return length;
    }

    public double area() {
        return width * length;
    }

}
