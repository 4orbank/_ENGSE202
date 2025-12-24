package Lab5;
import java.util.Scanner;

class BaseRental {
    protected String model;
    protected double rate;

    public BaseRental(String model, double rate) {
        this.model = model;
        this.rate = rate;
    }

    public double calculateFee() {
        return rate;
    }
}

class CarRental extends BaseRental {
    public CarRental(String model, double rate) {
        super(model, rate);
    }

    @Override
    public double calculateFee() {
        return rate + 100.0;
    }
}

class BikeRental extends BaseRental {
    public BikeRental(String model, double rate) {
        super(model, rate);
    }

    @Override
    public double calculateFee() {
        return rate * 1.10;
    }
}

public class Lab5_15 {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);

        String carModel = inputStream.nextLine();
        double carRate = inputStream.nextDouble();
        inputStream.nextLine();

        String bikeModel = inputStream.nextLine();
        double bikeRate = inputStream.nextDouble();

        BaseRental firstRental = new CarRental(carModel, carRate);
        BaseRental secondRental = new BikeRental(bikeModel, bikeRate);

        BaseRental[] rentalArray = { firstRental, secondRental };

        double totalFee = 0.0;
        for (BaseRental rental : rentalArray) {
            totalFee += rental.calculateFee();
        }

        System.out.println(totalFee);

        inputStream.close();
    }
}
