package com.example.task7ya.ex01;

public abstract class Employee
{
    private final int employeeId;
    private String name;
    private double baseSalary;
    public abstract double calculateMonthlySalary();

    public double getBaseSalary() {
        return baseSalary;
    }


    public String getName() {
        return name;
    }


    public int getEmployeeId()
    {
        return employeeId;
    }

    public Employee(final int employeeId, String name, double baseSalary )
    {
        this.baseSalary = baseSalary;
        this.name=name;
        this.employeeId=employeeId;
    }

    @Override
    public String toString()
    {
        return "ID: " + employeeId +
                ", Name: " + name +
                ", Base Salary: " + baseSalary;
    }
}
