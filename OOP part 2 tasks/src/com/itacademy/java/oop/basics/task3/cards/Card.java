package com.itacademy.java.oop.basics.task3.cards;

public abstract class Card {
    double balance;
    String cardHolderName;
    String cardNumber;

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    public abstract void credit(double amount);

    public abstract void debit(double amount);

}
