package com;

import com.employee.Employee;
import com.employee.EmployeeFactory;
import com.employee.EmployeeFactoryImpl;

public class Main {

    public static void main(String[] args) {

        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();

        Employee morcol = employeeFactory.createEmployee("Morcol", "Bluepin", 30.44);
        Employee sergey = employeeFactory.createEmployee("Sergey", "Peppers", 26.55);

        Employee[] employees = new Employee[]{
                morcol,
                sergey
        };

        printEmployeeReports(employees);
    }

    private static void printEmployeeReports(Employee[] employees) {
        for (final Employee employee : employees) {
            System.out.println(employee.getReport());
        }
    }

}
