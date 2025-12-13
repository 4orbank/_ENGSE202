package Lab3;

import java.util.Scanner;

class InventoryItem {

    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {

        this.productName = productName;
        initializeStock(initialStock);
    }

    private void initializeStock(int value) {

        if (value >= 0) {

            stock = value;
        }
        else {

            stock = 0;
        }
    }

    public String getProductName() {

        return productName;
    }

    public int getStock() {

        return stock;
    }

    public void addStock(int amount) {

        if (amount <= 0) {

            System.out.println("Invalid amount.");
            return;
        }

        increaseStock(amount);
        System.out.println("Stock added.");
    }

    private void increaseStock(int amount) {

        stock = stock + amount;
    }

    public void sellStock(int amount) {

        if (amount <= 0) {

            System.out.println("Invalid amount.");
            return;
        }

        if (amount > stock) {

            System.out.println("Not enough stock.");
            return;
        }

        decreaseStock(amount);
        System.out.println("Sale successful.");
    }

    private void decreaseStock(int amount) {

        stock = stock - amount;
    }
}

public class Lab3_8 {

    private static int readInt(Scanner sc) {

        int value;
        value = sc.nextInt();
        return value;
    }

    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);

        String productName;
        productName = sc.nextLine();

        int initialStock;
        initialStock = readInt(sc);

        InventoryItem item;
        item = new InventoryItem(productName, initialStock);

        int commandCount;
        commandCount = readInt(sc);

        for (int i = 0; i < commandCount; i++) {

            String command;
            command = sc.next();

            int amount;
            amount = readInt(sc);

            if (command.equals("ADD")) {

                item.addStock(amount);
            }
            else if (command.equals("SELL")) {

                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + item.getStock());

        sc.close();
    }
}
