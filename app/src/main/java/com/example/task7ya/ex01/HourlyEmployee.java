package com.example.task7ya.ex01;

class HourlyEmployee extends Employee
{

    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(int employeeId, String name,double hoursWorked, double hourlyRate)
    {
        super(employeeId, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateMonthlySalary()
    {
        double answer = this.hourlyRate * this.hoursWorked;
        return answer;
    }

    @Override
    public String toString() {
        return "Hourly Employee:\n" +
                super.toString() + "\n" +
                "Hours Worked: " + hoursWorked + "\n" +
                "Hourly Rate: " + hourlyRate;
    }
}
