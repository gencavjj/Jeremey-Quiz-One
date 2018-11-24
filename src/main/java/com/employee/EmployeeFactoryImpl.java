package com.employee;

public class EmployeeFactoryImpl implements EmployeeFactory {

    private int currentId;

    public Employee createEmployee(String firstName, String lastName, double hourlyPayRate) {
        return new Employee(generateId(), firstName, lastName, hourlyPayRate);
    }

    private int generateId() {
        return currentId++ + 1;
    }

}
