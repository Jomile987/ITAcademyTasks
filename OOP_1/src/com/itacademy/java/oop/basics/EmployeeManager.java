package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee empty = new Employee();
        Employee employee = new Employee("John", "Krasinski", ContractType.PART_TIME,
                LocalDate.parse("2020-02-01"), 1000, "Worker");

        System.out.println(employee);


    }

}
