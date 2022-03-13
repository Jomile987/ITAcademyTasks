package com.itacademy.java.oop.basics.task3;

public class ShapeApplication {

    public static void main(String[] args) {
        Square squareObjectFirst = new Square(5, 2);
        Square squareObjectSecond = new Square(-1, -2);
        Square squareObjectThird = new Square(8, 7);

        Square[] existingShapes = new Square[]{squareObjectFirst, squareObjectSecond, squareObjectThird};

        for (int eachShape = 0; eachShape < existingShapes.length; eachShape++) {
            if (existingShapes[eachShape].getLength() > 0) {
                if (existingShapes[eachShape].getWidth() > 0) {
                    System.out.println(existingShapes[eachShape].toString());
                } else {
                    System.out.println("Shape can't be with negative value: " + existingShapes[eachShape].getWidth());
                }
            } else {
                System.out.println("Shape can't be with negative value: " + existingShapes[eachShape].getLength());
            }
        }
    }
}
