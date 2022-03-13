package com.itacademy.java.oop.basics.task4;

public class Main {
    public static void main(String[] args) {

        Password one = new Password("/qwerty123456");
        Password two = new Password("d1k111g");
        Password three = new Password("11111112222");
        Password four = new Password("/*5544771dfsg");

        Password[] passwordsArray = new Password[]{one, two, three, four};

        for (int eachPassword = 0; eachPassword < passwordsArray.length; eachPassword++) {
            passwordsArray[eachPassword].validation();
        }

    }
}
