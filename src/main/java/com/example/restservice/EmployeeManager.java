package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private static Employees employees = new Employees();

    static {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("EMP001", "Reshma", "Pal", "reshma@gmail.com", "Software Developer"));
        employeeList.add(new Employee("EMP002", "Rahul", "Sharma", "rahul@gmail.com", "Backend Developer"));
        employeeList.add(new Employee("EMP003", "Priya", "Patil", "priya@gmail.com", "Frontend Developer"));
        employeeList.add(new Employee("EMP004", "Amit", "Kumar", "amit@gmail.com", "QA Engineer"));

        employees.setEmployees(employeeList);
    }

    public static Employees getEmployees() {
        return employees;
    }

    public static void addEmployee(Employee employee) {
    employees.getEmployees().add(employee);
    }
}