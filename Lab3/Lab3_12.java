package Lab3;

import java.util.Scanner;

class employee {

    private String name;
    private double monthlySalary;

    public employee(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class Lab3_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double monthlySalary = Double.parseDouble(sc.nextLine());
        double taxRate = Double.parseDouble(sc.nextLine());
        double raiseAmount = Double.parseDouble(sc.nextLine());

        employee emp = new employee(name, monthlySalary);

        System.out.println("Tax (Before): " + (int) emp.calculateTax(taxRate));
        emp.giveRaise(raiseAmount);

        System.out.println("Tax (After): " + (int) emp.calculateTax(taxRate));

        sc.close();
    }
}
