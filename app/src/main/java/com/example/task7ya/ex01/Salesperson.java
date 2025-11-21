package com.example.task7ya.ex01;

public class Salesperson extends Employee implements BonusEligible
{
    private double salesCommission;
    private double totalSales;
    public Salesperson(int employeeId, String name, double baseSalary,double salesCommission,double totalSales)
    {
        super(employeeId, name, baseSalary);
        this.salesCommission = salesCommission;
        this.totalSales = totalSales;

    }

    @Override
    public double calculateBonus()
    {
        double answer = this.totalSales * 0.05;
        return answer;
    }

    @Override
    public double calculateMonthlySalary()
    {
        double answer = this.getBaseSalary() + (this.totalSales * this.salesCommission);
        return answer;
    }


}
