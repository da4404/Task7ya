package com.example.task7ya.ex01;

public class HourlyEmployee extends Employee
{

    double hoursWorked;
    double hourlyRate;

    public HourlyEmployee(double hoursWorked, double hourlyRate)
    {
        super(id, name, baseSalary);
    }
    @Override
    public double calculateMonthlySalary()
    {
        double answer = this.hourlyRate * this.hoursWorked;
        return answer;
    }
}
