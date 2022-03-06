package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String surname;
    private ContractType contractType;
    private LocalDate contractStartDate;
    private double salary;
    private String position;

    public Employee() {

    }

    public Employee(String name, String surname, ContractType contractType, LocalDate contractStartDate, double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public Double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractType=" + contractType.contractType +
                ", contractStartDate=" + contractStartDate +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
