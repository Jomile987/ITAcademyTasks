package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class LoansApplication {

    public static void main(String[] args) {
        Customer empty = new Customer();
        Customer one = new Customer("Jomile", "Kundortaite", 25, 423456789);

        Loan emptyTwo = new Loan();
        Loan first = new Loan(32545,12456, LoanType.CONSUMER_LOAN, LocalDate.parse("2024-04-12"));
        Loan second = new Loan(95634,22543,LoanType.LEASING,LocalDate.parse("2050-07-30"));

        Loan[] customerLoans = new Loan[]{first, second};
        one.setCustomerLoans(customerLoans);


        System.out.println(one.toString());


    }
}
