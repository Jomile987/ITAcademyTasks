package com.itacademy.java.oop.basics.task3.cards;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughBalanceException;
import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughtCreditException;

public abstract class Card {
    public static double balance = 1000;
    String cardHolderName = "Tom";
    String cardNumber = "bla_bla";

    public static void credit(double amount) {

    }

    public static void debit(double amount) {

    }

}
