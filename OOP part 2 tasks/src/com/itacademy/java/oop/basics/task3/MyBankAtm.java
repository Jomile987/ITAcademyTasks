package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.cards.Card;
import com.itacademy.java.oop.basics.task3.exceptions.InsuficientAtmFundsException;

public class MyBankAtm implements Atm {
    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawCredit(double withdrawAmount) {
        if (withdrawAmount < balance) {
            Card.credit(withdrawAmount);
            balance -= withdrawAmount;
        } else {
            throw new InsuficientAtmFundsException();
        }
    }

    @Override
    public void withdrawDebit(double withdrawAmount) {
        if (withdrawAmount < balance) {
            Card.debit(withdrawAmount);
            balance -= withdrawAmount;
        } else {
            throw new InsuficientAtmFundsException();
        }
    }
}
