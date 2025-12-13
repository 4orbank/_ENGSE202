package Lab3;

import java.util.Scanner;

// คลาส Product สำหรับนับจำนวนสินค้าที่ถูกสร้าง
class Product {

    private String name;
    private static int productCount = 0;

    public Product(String name) {
        this.name = name;
        productCount++;
    }

    public String getName() {
        return name;
    }

    public static int getProductCount() {
        return productCount;
    }
}

public class Lab3_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับจำนวนสินค้าที่จะสร้าง
        System.out.print("Enter count product : ");
        int n = sc.nextInt();
        sc.nextLine(); // เคลียร์บรรทัด

        // วนลูปรับชื่อสินค้าและสร้าง Product
        for (int i = 0; i < n; i++) {
            System.out.print("Product " + (i + 1) + " name : ");
            String productName = sc.nextLine();
            new Product(productName);
        }

        // แสดงจำนวนสินค้าทั้งหมด
        System.out.println("Count product : " + Product.getProductCount());

        sc.close();
    }
}
