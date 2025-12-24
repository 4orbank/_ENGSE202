package Lab5;

import java.util.Scanner;

class Employee {

    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {

    @Override
    public double calculateBonus() {
        double baseBonus = super.calculateBonus();
        double extraBonus = salary * 0.05;
        return baseBonus + extraBonus;
    }
}

public class Lab5_3 {
    public static void main(String[] args) {

        Scanner incomeReader = new Scanner(System.in);

        double monthlyPay = Double.parseDouble(incomeReader.nextLine());

        Manager bossUnit = new Manager();
        bossUnit.salary = monthlyPay;

        double finalBonus = bossUnit.calculateBonus();
        System.out.println(finalBonus);

        incomeReader.close();
    }
}
