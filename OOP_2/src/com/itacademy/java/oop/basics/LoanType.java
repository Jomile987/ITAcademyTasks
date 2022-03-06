package com.itacademy.java.oop.basics;

public enum LoanType {
    LEASING("Leasing"),
    CONSUMER_LOAN("Consumer loan");

    public final String loanType;

    LoanType(String loanType) {
        this.loanType = loanType;
    }

}
