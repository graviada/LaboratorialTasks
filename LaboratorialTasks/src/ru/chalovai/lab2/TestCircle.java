package ru.chalovai.lab2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0f, "blue");
        System.out.println("Circle c1: radius is " + c1.getRadius()
                + ", color is " + c1.getColor()
                + ", area is " + c1.getArea());

        Circle c2 = new Circle(2.0f);
        System.out.println("Circle c2: radius is " + c2.getRadius()
                + ", color is " + c2.getColor()
                + ", area is " + c2.getArea());

        Circle c3 = new Circle();
        System.out.println("Circle c3: radius is " + c3.getRadius()
                + ", color is " + c3.getColor()
                + ", area is " + c3.getArea());
    }
}
