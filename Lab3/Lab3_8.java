package Lab3;

import java.util.Scanner;

class InventoryItem {

    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        this.stock = (initialStock >= 0) ? initialStock : 0;
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > stock) {
            System.out.println("Not enough stock.");
        } else {
            stock -= amount;
            System.out.println("Sale successful.");
        }
    }
}

public class Lab3_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String productName = sc.nextLine();
        int initialStock = sc.nextInt();

        InventoryItem item = new InventoryItem(productName, initialStock);

        int commandCount = sc.nextInt();

        for (int i = 0; i < commandCount; i++) {
            String command = sc.next();
            int amount = sc.nextInt();

            if (command.equals("ADD")) {
                item.addStock(amount);
            } else if (command.equals("SELL")) {
                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + item.getStock());

        sc.close();
    }
}
