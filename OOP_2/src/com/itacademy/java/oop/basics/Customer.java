package com.itacademy.java.oop.basics;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private long personalNumber;
    private Loan[] customerLoans;

    public Customer() {

    }

    public Customer(String name, String surname, int age, long personalNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
    }

    public Loan[] getCustomerLoans() {
        return customerLoans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPersonalNumber(long personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setCustomerLoans(Loan[] customerLoans) {
        this.customerLoans = customerLoans;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public long getPersonalNumber() {
        return personalNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber=" + personalNumber +
                ", customerLoans=" + Arrays.toString(customerLoans) +
                '}';
    }
}
