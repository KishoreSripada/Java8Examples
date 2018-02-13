package com.java8.examples;

import java.util.ArrayList;
import java.util.List;

public class ListStreamExample {
    public static void main(String[] args) {
        List<Employee> listEmployees = new ArrayList<Employee>();
        listEmployees.add(new Employee(1));
        int employeeID = 1;
        Employee employee =
                listEmployees.
                stream().filter(e -> e.getEmployeeID() == employeeID)
                        .findAny().
                    orElse(null);

        System.out.println(employee.getEmployeeID());
    }
}