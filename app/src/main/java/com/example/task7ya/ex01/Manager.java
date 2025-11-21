package com.example.task7ya.ex01;

class Manager extends Employee implements BonusEligible
{
    private String department;
    private double managementBonusPercentage;

    public Manager(int employeeId, String name, double baseSalary,String department,double managementBonusPercentage)
    {
        super(employeeId, name, baseSalary);
        this.department = department;
        this.managementBonusPercentage = managementBonusPercentage;

    }
    @Override
    public double calculateBonus()
    {
        double answer = this.getBaseSalary() * this.managementBonusPercentage;
        return answer;
    }

    @Override
    public double calculateMonthlySalary()
    {
        return this.getBaseSalary();
    }
    @Override
    public String toString()
    {
        return "Manager:\n" +
                super.toString() + "\n" +
                "Department: " + department + "\n" +
                "Bonus Percentage: " + managementBonusPercentage;
    }
}
