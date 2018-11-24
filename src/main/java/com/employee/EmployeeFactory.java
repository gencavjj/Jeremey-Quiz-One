package com.employee;

public interface EmployeeFactory {

    Employee createEmployee(String firstName, String lastName, double hourlyPayRate);

}
