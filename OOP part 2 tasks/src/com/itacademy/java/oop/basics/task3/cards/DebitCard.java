package com.itacademy.java.oop.basics.task3.cards;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughBalanceException;

public class DebitCard extends Card {
    private final double interest;
    private final double debit; // how much money client is withdrawing.

    public DebitCard(double interest, double debit, double balance, String cardHolderName, String cardNumber) {
        super(balance,cardHolderName,cardNumber);
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
    public void credit(double amount) {

    }

    @Override
    public void debit(double amount) {
        if (totalWithdrawAmount(amount) < balance) {
            balance -= totalWithdrawAmount(amount);
            System.out.println(balance);
        } else {
            throw new NotEnoughBalanceException();
        }
    }

    public double totalWithdrawAmount(double amount) {
        return amount + (amount * interest / 100);
    }
}
