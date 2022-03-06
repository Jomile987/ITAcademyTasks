package com.itacademy.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) {
        CreditCard one = new CreditCard(1.5,-1000);
        DebitCard two = new DebitCard(-0.27,100);
        //Card last = new Card(1000,"Tomas","bla bla");
        MyBankAtm bank = new MyBankAtm(10000);

        bank.withdrawCredit(one,100);


        one.credit(150);


    }
}
