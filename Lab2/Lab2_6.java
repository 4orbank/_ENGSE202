package Lab2;

import java.util.Scanner;

public class Lab2_6 {

    static class BankAccount {
        String name;
        double balance;

        BankAccount(String ownerName, double initialBalance) {
            this.name = ownerName;
            this.balance = initialBalance;
        }

        void deposit(double amount) {
            balance += amount;
        }

        void displaySummary() {
            System.out.println("Owner: " + name);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Scanner Getbalance = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = Getbalance.nextLine();
        System.out.print("Enter deposit : ");
        double initial = Getbalance.nextDouble();
        System.out.print("Enter amount : ");
        double amount = Getbalance.nextDouble();

        BankAccount acc = new BankAccount(name, initial);

        acc.deposit(amount);

        acc.displaySummary();

        Getbalance.close();
    }
}
