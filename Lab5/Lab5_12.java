package Lab5;
import java.util.Scanner;

class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

class BasicService extends Service {
    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

public class Lab5_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String basicName = input.nextLine();
        double basicPrice = input.nextDouble();
        input.nextLine();

        String premiumName = input.nextLine();
        double premiumPrice = input.nextDouble();
        double premiumRate = input.nextDouble();

        Service[] services = new Service[2];
        services[0] = new BasicService(basicName, basicPrice);
        services[1] = new PremiumService(premiumName, premiumPrice, premiumRate);

        for (Service service : services) {
            System.out.println(service.calculateFinalPrice());
        }

        input.close();
    }
}

