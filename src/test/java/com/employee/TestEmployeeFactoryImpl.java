package com.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestEmployeeFactoryImpl {

    private String firstName;
    private String lastName;
    private double hourlyPayRate;

    private EmployeeFactoryImpl employeeFactory;

    @BeforeEach
    void init() {
        firstName = "Morcol";
        lastName = "Bluepin";
        hourlyPayRate = 22.07;

        employeeFactory = new EmployeeFactoryImpl();
    }

    @Test
    void testCreateEmployee() {
        Employee predictedEmployee = new Employee(1, firstName, lastName, hourlyPayRate);

        Employee returnedEmployee = employeeFactory.createEmployee(firstName, lastName, hourlyPayRate);

        assertEquals(predictedEmployee, returnedEmployee, "The employee was not created as expected");
    }

}
