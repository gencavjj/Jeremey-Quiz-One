package com.employee;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private double hourlyPayRate;

    public Employee() {

    }

    Employee(int employeeId, String firstName, String lastName, double hourlyPayRate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public String getReport() {
        return new StringBuilder()
                .append("Employee ID: ").append(employeeId).append('\n')
                .append("First name: " ).append(firstName).append('\n')
                .append("Last name: ").append(lastName).append('\n')
                .append("Hourly pay rate: ").append(hourlyPayRate).append('\n')
                .toString();
    }

    @Override
    public boolean equals(Object o) {

        // If the VARIABLE THAT THIS IS BEING COMPARED TO points to the same location in memory as THIS VARIABLE
        if (o == this) {
            return true;
        }

        // If the object that this is being compared to is not an instance of an employee
        if (!(o instanceof Employee)) {
            return false;
        }

        // Cast the object that this is being compared to, to an Employee type (so that we can compare property values)
        Employee other = (Employee) o;

        // Return true if all properties are equal
        return (employeeId == other.employeeId)
                && firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && (hourlyPayRate == other.hourlyPayRate);
    }

}
