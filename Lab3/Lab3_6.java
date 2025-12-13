package Lab3;

import java.util.Scanner;

class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {

        setInitialBalance(initialBalance);
    }

    private void setInitialBalance(double value) {

        if (value < 0) {

            this.balance = 0;
        }
        else {

            this.balance = value;
        }
    }

    public double getBalance() {

        return this.balance;
    }

    public void deposit(double amount) {

        boolean validAmount;
        validAmount = amount > 0;

        if (validAmount) {

            addToBalance(amount);
            System.out.println("Deposit successful.");
        }
        else {

            System.out.println("Invalid deposit amount.");
        }
    }

    private void addToBalance(double amount) {

        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > this.balance) {

            System.out.println("Insufficient funds.");
            return;
        }

        subtractFromBalance(amount);
        System.out.println("Withdrawal successful.");
    }

    private void subtractFromBalance(double amount) {

        this.balance = this.balance - amount;
    }
}

public class Lab3_6 {

    private static double readDouble(Scanner sc) {

        double value;
        value = sc.nextDouble();
        return value;
    }

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double startBalance;
        startBalance = readDouble(scanner);

        double depositValue;
        depositValue = readDouble(scanner);

        double withdrawValue;
        withdrawValue = readDouble(scanner);

        BankAccount myAccount;
        myAccount = new BankAccount(startBalance);

        myAccount.deposit(depositValue);

        myAccount.withdraw(withdrawValue);

        double resultBalance;
        resultBalance = myAccount.getBalance();

        System.out.println("Final Balance: " + resultBalance);

        scanner.close();
    }
}
