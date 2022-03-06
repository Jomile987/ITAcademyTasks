package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape {
    private double radius;
    private double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * radius;
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
