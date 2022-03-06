package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card {
    private double interest;
    private final double credit; // how much client can go into debt

    public CreditCard(double interest, double credit) {
        this.interest = interest;
        this.credit = credit;
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public void credit(double amount) {
        /*if (amount + (amount * interest / 100) <= balance) {
            balance -= amount + (amount * interest / 100);
        }*/
    }
}
