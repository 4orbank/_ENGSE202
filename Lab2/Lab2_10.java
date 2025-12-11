package Lab2;

import java.util.Scanner;

public class Lab2_10 {

    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    static class ShoppingCart {
        Product[] items = new Product[10];
        int itemCount = 0;

        void addProduct(Product p) {
            items[itemCount] = p;
            itemCount++;
        }

        double calculateTotalPrice() {
            double total = 0;
            for (int i = 0; i < itemCount; i++) {
                total += items[i].price;
            }
            return total;
        }
    }

    public static void main(String[] args) {

        Scanner shopping = new Scanner(System.in);
        
        System.out.print("Enter number of products : ");
        int n = shopping.nextInt();
        shopping.nextLine();

        ShoppingCart cart = new ShoppingCart();

        for (int i = 0; i < n; i++) {
        	System.out.print("Enter product name : ");
            String name = shopping.nextLine();
            System.out.print("Enter price : ");
            double price = shopping.nextDouble();
            shopping.nextLine();

            Product p = new Product(name, price);
            cart.addProduct(p);
        }

        double result = cart.calculateTotalPrice();
        System.out.println(result);

        shopping.close();
    }
}
