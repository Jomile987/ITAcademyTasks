package com.itacademy.java.oop.basics.task3.cards;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughtCreditException;

public class CreditCard extends Card {
    private final double interest;
    private final double credit; // how much client can go into debt

    public CreditCard(double interest, double credit,double balance, String cardHolderName, String cardNumber){
        super(balance,cardHolderName,cardNumber);
        this.interest = interest;
        this.credit = credit;
    }

    public double getInterest() {
        return interest;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void credit(double amount) {
        if (totalWithdrawAmount(amount) < balance - getCredit()) {
            balance -= totalWithdrawAmount(amount);
            System.out.println(balance);
        } else {
            throw new NotEnoughtCreditException();
        }
    }

    @Override
    public void debit(double amount) {

    }

    public double totalWithdrawAmount(double amount) {
        return amount + (amount * interest / 100);
    }
}
