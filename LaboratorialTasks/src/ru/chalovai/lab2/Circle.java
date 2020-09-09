package ru.chalovai.lab2;

public class Circle {
    private float radius;
    private String color;

    public Circle() {
        radius = 1.0f;
        color = "white";
    }
    public Circle(float r) {
        radius = r;
        color = "white";
    }
    public Circle(float r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
