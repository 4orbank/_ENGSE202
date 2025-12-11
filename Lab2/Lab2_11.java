package Lab2;

import java.util.Scanner;

public class Lab2_11 {

    static class Car {
        private String model;
        private int year;

        Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int newYear) {
            this.year = newYear;
        }
    }

    public static void main(String[] args) {

        Scanner carmodel = new Scanner(System.in);
        
        System.out.print("Enter Car model : ");
        String model = carmodel.nextLine();
        System.out.print("Enter model year : ");
        int year = carmodel.nextInt();
        System.out.print("Enter current year : ");
        int newYear = carmodel.nextInt();

        Car yearcar = new Car(model, year);

        yearcar.setYear(newYear);

        System.out.println("Model: " + yearcar.getModel());
        System.out.println("Year: " + yearcar.getYear());

        carmodel.close();
    }
}
