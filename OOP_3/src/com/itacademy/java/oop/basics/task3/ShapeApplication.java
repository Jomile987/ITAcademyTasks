package com.itacademy.java.oop.basics.task3;

public class ShapeApplication {

    public static void main(String[] args) {
        Square empty = new Square();
        Square one = new Square(5, 2);
        Square two = new Square(-1, -2);
        Square three = new Square(8, 7);

        Square[] all = new Square[]{one, two, three};

        for (int eachShape = 0; eachShape < all.length; eachShape++) {
            if (all[eachShape].getLength() > 0) {
                if (all[eachShape].getWidth() > 0) {
                    System.out.println(all[eachShape].toString());
                } else {
                    System.out.println("Shape can't be with negative value: " + all[eachShape].getWidth());
                }
            } else {
                System.out.println("Shape can't be with negative value: " + all[eachShape].getLength());
            }
        }
    }
}
