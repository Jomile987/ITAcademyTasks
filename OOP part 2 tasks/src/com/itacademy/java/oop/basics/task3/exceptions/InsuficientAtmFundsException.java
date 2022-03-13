package com.itacademy.java.oop.basics.task3.exceptions;

public class InsuficientAtmFundsException extends RuntimeException {

    public InsuficientAtmFundsException(){
        System.out.println("ATM is empty. Money can't be withdrawn.");
    }

}
