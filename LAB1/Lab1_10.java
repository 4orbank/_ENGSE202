package Lab1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab1_10 {
	
	public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner getint = new Scanner(System.in);

        try {
            System.out.print("Enter width: ");
            double width = getint.nextDouble();

            System.out.print("Enter height: ");
            double height = getint.nextDouble();

            double area = calculateArea(width , height);

            System.out.println("Area = " + area);

        } catch (InputMismatchException e) {
            System.out.println("Err: Please enter number only.");
        }

        getint.close();
    }
}
