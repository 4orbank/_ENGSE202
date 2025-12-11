package Lab2;

import java.util.Scanner;

public class Lab2_7 {

    static class BankAccount {
        String name;
        double balance;

        BankAccount(String ownerName, double initialBalance) {
            this.name = ownerName;
            this.balance = initialBalance;
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        }

        void displayBalance() {
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Scanner getamount = new Scanner(System.in);
        
        System.out.print("Enter a name : ");
        String name = getamount.nextLine();
        System.out.print("Enter balance : ");
        double initial = getamount.nextDouble();
        System.out.print("Enter withdrawal amount 1 : ");
        double w1 = getamount.nextDouble();
        System.out.print("Enter withdrawal amount 2 : ");
        double w2 = getamount.nextDouble();

        BankAccount acc = new BankAccount(name, initial);

        acc.withdraw(w1);
        acc.withdraw(w2);

        acc.displayBalance();

        getamount.close();
    }
}
