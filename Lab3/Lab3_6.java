package Lab3;

import java.util.Scanner;

// คลาสจำลองบัญชีธนาคารที่ปลอดภัย
class BankAccount {

    // Attribute (Encapsulation)
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // คืนค่ายอดเงินคงเหลือ
    public double getBalance() {
        return balance;
    }

    // ฝากเงิน
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // ถอนเงิน
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class Lab3_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("Enter initialBalance : ");
        double initialBalance = sc.nextDouble();
        System.out.print("Enter depositamount : ");
        double depositAmount = sc.nextDouble();
        System.out.print("Enter withdrawamount : ");
        double withdrawAmount = sc.nextDouble();

        // สร้างบัญชีธนาคาร
        BankAccount account = new BankAccount(initialBalance);

        // ฝากเงิน
        account.deposit(depositAmount);

        // ถอนเงิน
        account.withdraw(withdrawAmount);

        // แสดงยอดเงินคงเหลือสุดท้าย
        System.out.println("Final Balance: " + account.getBalance());

        sc.close();
    }
}
