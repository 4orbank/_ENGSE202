package Lab2;

import java.util.Scanner;

public class Lab2_5 {

    static class Rectangle {
        double width;
        double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double Area() {
            return width * height;
        }

        double meter() {
            return 2 * (width + height);
        }
    }

    public static void main(String[] args) {

        Scanner getmeter = new Scanner(System.in);
        
        System.out.print("Pls enter width : ");
        double width = getmeter.nextDouble();
        System.out.print("Pls enter heigh : ");
        double height = getmeter.nextDouble();

        Rectangle rus = new Rectangle(width, height);

        System.out.println(rus.Area());
        System.out.println(rus.meter());

        getmeter.close();
    }
}
