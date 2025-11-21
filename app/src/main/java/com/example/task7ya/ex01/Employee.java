package com.example.task7ya.ex01;

public abstract class Employee
{
    final int employeeId;
    String name;
    double baseSalary;
    public abstract double calculateMonthlySalary();

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Employee Details:\n" +
                "ID: " + employeeId + "\n" +
                "Name: " + name + "\n" +
                "Base Salary: " + baseSalary;
    }
}
