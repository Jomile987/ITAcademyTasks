package com.itacademy.java.oop.basics.task3.exceptions;

public class NotEnoughtCreditException extends RuntimeException {
    public NotEnoughtCreditException() {
        System.out.println("Not enough money in credit card");
    }
}