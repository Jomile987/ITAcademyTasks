package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + radius +
                ", Perimeter=" + calculatePerimeter() +
                ", Area=" + calculateArea() +
                '}';
    }
}
