package com.example.task7ya.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new Manager(1, "darya hamalca", 200000000000.99999999999999999, "Sales", 99999999999.99999999));
        allEmployees.add(new Salesperson(2, "Shelly fux", 40000, 0.08, 500));
        allEmployees.add(new HourlyEmployee(3, "Gili", 30000, 80, 40));
        allEmployees.add(new HourlyEmployee(4, "Noa", 300, 120, 40));
        allEmployees.add(new HourlyEmployee(5, "Shay", 500, 20, 40));
        double totalBonuses = 0;
        for (Employee emplo : allEmployees) {
            System.out.println(emplo);
            System.out.println(emplo.calculateMonthlySalary());
        }
        for (Employee emplo : allEmployees)
        {

            if (emplo instanceof BonusEligible)
            {
                BonusEligible bonusEmplo = (BonusEligible) emplo;
                totalBonuses += bonusEmplo.calculateBonus();
            }
        }
        System.out.println("Total bonuses: " + totalBonuses);

    }


}
