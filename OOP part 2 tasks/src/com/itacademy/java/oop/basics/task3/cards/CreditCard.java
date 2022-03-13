package com.itacademy.java.oop.basics.task3.cards;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughtCreditException;

public class CreditCard extends Card {
    private static double interest;
    private static double credit; // how much client can go into debt

    public CreditCard(double interest, double credit) {
        this.interest = interest;
        this.credit = credit;
    }

    public static double getInterest() {
        return interest;
    }

    public static double getCredit() {
        return credit;
    }

    public static void credit(double amount) {
        if (totalWithdrawAmount(amount) < balance + getCredit()) {
            balance -= totalWithdrawAmount(amount);
            System.out.println(balance);
        } else {
            throw new NotEnoughtCreditException();
        }
    }

    public static double totalWithdrawAmount(double amount) {
        return amount + (amount * interest / 100);
    }
}
