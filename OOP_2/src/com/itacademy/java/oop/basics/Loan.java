package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Loan {
    private int id;
    private long amount;
    private LoanType loanType;
    private LocalDate terminationDate;

    public Loan() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
    }

    public Loan(int id, long amount, LoanType loanType, LocalDate terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public int getId() {
        return id;
    }

    public long getAmount() {
        return amount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public LocalDate getTerminationDate() {
        return terminationDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                '}';
    }
}
