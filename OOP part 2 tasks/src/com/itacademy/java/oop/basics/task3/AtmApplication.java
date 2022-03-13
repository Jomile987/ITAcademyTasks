package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.cards.CreditCard;
import com.itacademy.java.oop.basics.task3.cards.DebitCard;

public class AtmApplication {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1.5, -100);
        DebitCard debitCard = new DebitCard(-1.5, 0);

        MyBankAtm bank = new MyBankAtm(10000);


        bank.withdrawCredit(1000);

    }
}
