package com.itacademy.java.oop.basics.task3;

public class ShapeApplication {

    public static void main(String[] args) {
        Square empty = new Square();
        Square one = new Square(5, 2);
        Square two = new Square(-1, -2);
        Square three = new Square(8, 7);

        Square[] existingShapes = new Square[]{one, two, three};

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
