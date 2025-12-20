package Lab4;
import java.util.Scanner;

class Product {

    private String name;
    private double price;

    public Product(String name) {
        this(name, 0.0);
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

public class Lab4_2 {
    public static void main(String[] args) {

        Scanner Getinfo = new Scanner(System.in);

        int mode = Getinfo.nextInt();
        Getinfo.nextLine(); //ล้าง

        Product product;

        if (mode == 1) {
            String name = Getinfo.nextLine();
            product = new Product(name);
        } else {
            String name = Getinfo.nextLine();
            double price = Getinfo.nextDouble();
            product = new Product(name, price);
        }

        product.displayInfo();
    }
}
