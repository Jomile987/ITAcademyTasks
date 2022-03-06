package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm {
    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawCredit(CreditCard card, double withdrawAmount) {
        withdrawAmount += (withdrawAmount * card.getInterest() / 100);
        if (this.balance - withdrawAmount < 0) {
            throw new InsuficientAtmFundsException();
        } else {
            if (withdrawAmount <= card.balance) {
                this.balance -= withdrawAmount;
                card.balance -= withdrawAmount;
            }else{
                throw new InsuficientAccountBalance();
            }

        }
    }

    @Override
    public void withdrawDebit(DebitCard card) {
        double amount;
        amount = card.getDebit() + (card.getDebit() * card.getInterest() / 100);
        if (amount > this.balance) {
            throw new InsuficientAtmFundsException();
        }

    }
}
