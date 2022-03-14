package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.cards.Card;
import com.itacademy.java.oop.basics.task3.cards.CreditCard;
import com.itacademy.java.oop.basics.task3.cards.DebitCard;

public class AtmApplication {
    public static void main(String[] args) {
        Card creditCard = new CreditCard(1.5, -100,100,"Tom","8654889");
        Card debitCard = new DebitCard(-1.5, 0,100,"Tom","8654889");

        MyBankAtm bank = new MyBankAtm(100000);

        bank.withdrawCredit(creditCard,10);

    }
}
