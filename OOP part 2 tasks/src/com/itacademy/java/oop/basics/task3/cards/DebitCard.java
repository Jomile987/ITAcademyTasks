package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card{
    private double interest;
    private double debit; // how much money client is withdrawing.

    public DebitCard(double interest, double debit) {
        this.interest = interest;
        this.debit = debit;
    }

    public double getInterest() {
        return interest;
    }

    public double getDebit() {
        return debit;
    }

    @Override
    public void debit(double amount) {
        super.debit(amount);
    }
}
