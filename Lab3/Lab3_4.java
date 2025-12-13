package Lab3;

import java.util.Scanner;

class Product {

    private String name;
    private static int productCount = 0;

    public Product(String name) {
        this.name = name;
        productCount = productCount + 1;
    }

    public String getName() {
        return this.name;
    }

    public static int getProductCount() {
        return productCount;
    }
}

public class Lab3_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        sc.nextLine();

        Product[] products;
        products = new Product[n];

        int i;
        for (i = 0; i < n; i++) {

            String productName;
            productName = sc.nextLine();

            products[i] = new Product(productName);
        }

        int total;
        total = Product.getProductCount();
        System.out.println(total);

        sc.close();
    }
}
