package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {

    public static void main(String[] args) {
        Square one = new Square(5);
        Circle two = new Circle(1.5);

        System.out.println(one.toString());
        System.out.println(two.toString());
    }
}
