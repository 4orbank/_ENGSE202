package Lab3;

import java.util.Scanner;

class bankaccount {

    private double balance;
    private static int totalTransactionCount = 0;

    public bankaccount(double initialDeposit) {
        if (initialDeposit >= 0) {
            balance = initialDeposit;
        } else {
            balance = 0;
        }
        System.out.println("Account created.");
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        }
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class Lab3_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankaccount myAccount = null;

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            switch (command) {
                case "CREATE":
                    double initialDeposit = Double.parseDouble(sc.nextLine());
                    myAccount = new bankaccount(initialDeposit);
                    break;

                case "DEPOSIT":
                    double depositAmount = Double.parseDouble(sc.nextLine());
                    if (myAccount != null) {
                        myAccount.deposit(depositAmount);
                    } else {
                        System.out.println("No account exists.");
                    }
                    break;

                case "WITHDRAW":
                    double withdrawAmount = Double.parseDouble(sc.nextLine());
                    if (myAccount != null) {
                        myAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account exists.");
                    }
                    break;

                case "STATUS":
                    if (myAccount != null) {
                        System.out.println("Balance: " + myAccount.getBalance());
                    } else {
                        System.out.println("No account exists.");
                    }
                    break;

                case "GLOBAL_STATUS":
                    System.out.println("Total Transactions: " + bankaccount.getTotalTransactionCount());
                    break;
            }
        }

        sc.close();
    }
}
