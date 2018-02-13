package com.java8.examples;

public class Employee {
    private int age;
    private String firstName;
    private int employeeID;
    private String lastName;

    public Employee(int employeeID) {
        this.employeeID = employeeID;
    }
    public Employee(int age, String firstName, String lastName, int employeeID) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
