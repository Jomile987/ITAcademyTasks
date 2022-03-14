package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.cards.Card;
import com.itacademy.java.oop.basics.task3.cards.CreditCard;
import com.itacademy.java.oop.basics.task3.cards.DebitCard;

public interface Atm {
    void withdrawCredit(Card card, double withdrawAmount);
    void withdrawDebit(Card card,double withdrawAmount);
}
