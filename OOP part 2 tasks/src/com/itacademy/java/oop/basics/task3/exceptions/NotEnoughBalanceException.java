package com.itacademy.java.oop.basics.task3.exceptions;

public class NotEnoughBalanceException extends RuntimeException {
    public NotEnoughBalanceException() {
        System.out.println("Not enough money in credit card");
    }
}
