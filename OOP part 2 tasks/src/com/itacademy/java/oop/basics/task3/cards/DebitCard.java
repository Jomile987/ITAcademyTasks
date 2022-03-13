package com.itacademy.java.oop.basics.task3.cards;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughBalanceException;

public class DebitCard extends Card {
    private static double interest;
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

    public static void debit(double amount) {
        if (totalWithdrawAmount(amount) < balance) {
            balance -= totalWithdrawAmount(amount);
            System.out.println(balance);
        } else {
            throw new NotEnoughBalanceException();
        }
    }
    public static double totalWithdrawAmount(double amount) {
        return amount + (amount * interest / 100);
    }
}
