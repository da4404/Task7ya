package com.example.task7ya.ex01;

class HourlyEmployee extends Employee
{

    double hoursWorked;
    double hourlyRate;

    public HourlyEmployee(int employeeId, String name, double baseSalary,double hoursWorked, double hourlyRate)
    {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateMonthlySalary()
    {
        double answer = this.hourlyRate * this.hoursWorked;
        return answer;
    }
}
