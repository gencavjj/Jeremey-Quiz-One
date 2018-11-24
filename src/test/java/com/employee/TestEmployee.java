package com.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestEmployee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private double hourlyPayRate;

    private Employee employee;

    @BeforeEach
    void init() {
        employeeId = 1;
        firstName = "Morcol";
        lastName = "Bluepin";
        hourlyPayRate = 22.07;

        employee = new Employee(employeeId, firstName, lastName, hourlyPayRate);
    }

    @Test
    void testGetReport() {
        String predictedReport = new StringBuilder()
                .append("Employee ID: ").append(employeeId).append('\n')
                .append("First name: " ).append(firstName).append('\n')
                .append("Last name: ").append(lastName).append('\n')
                .append("Hourly pay rate: ").append(hourlyPayRate).append('\n')
                .toString();

        String actualReport = employee.getReport();

        assertEquals(predictedReport, actualReport, "The expected report was not returned");
    }

    @Test
    void testEquals() {
        Employee employee2 = new Employee(employeeId, firstName, lastName, hourlyPayRate);

        assertEquals(employee, employee2, "The employee objects should be ");
    }

}
