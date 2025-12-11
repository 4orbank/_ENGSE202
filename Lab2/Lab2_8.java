package Lab2;

import java.util.Scanner;

public class Lab2_8 {

    static class TempConverter {

        public static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9.0 / 5.0) + 32;
        }

        public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5.0 / 9.0;
        }
    }

    public static void main(String[] args) {

        Scanner getcrof = new Scanner(System.in);
        
        System.out.print("Enter mode (C_TO_F or F_TO_C): ");
        String mode = getcrof.nextLine();
        System.out.print("Enter temperature value: ");
        double temp = getcrof.nextDouble();

        double result;

        if (mode.equals("C_TO_F")) {
            result = TempConverter.celsiusToFahrenheit(temp);
            System.out.println(result + "F");
        } else if (mode.equals("F_TO_C")) {
            result = TempConverter.fahrenheitToCelsius(temp);
            System.out.println(result + "C");
        } else {
            return;
        }

        

        getcrof.close();
    }
}
