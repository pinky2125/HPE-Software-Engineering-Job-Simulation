package com.example.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeControllerTest {

    @Test
    public void testGetEmployees() {

        Employees employees = EmployeeManager.getEmployees();

        assertNotNull(employees);

        assertEquals(4, employees.getEmployees().size());

    }

}