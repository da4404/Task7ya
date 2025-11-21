package com.example.task7ya.ex01;

class HourlyEmployee extends Employee
{

    private double hoursWorked;
    private double hourlyRate;

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
