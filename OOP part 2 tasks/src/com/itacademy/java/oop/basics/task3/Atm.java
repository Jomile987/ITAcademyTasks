package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.cards.CreditCard;
import com.itacademy.java.oop.basics.task3.cards.DebitCard;

public interface Atm {
    void withdrawCredit(double withdrawAmount);
    void withdrawDebit(double withdrawAmount);
}
