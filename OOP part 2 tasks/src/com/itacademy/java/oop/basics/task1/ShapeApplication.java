package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {

    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape circle = new Circle(1.5);

        System.out.println(square);
        System.out.println(circle);
    }
}
