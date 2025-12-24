package Lab5;
import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class Lab5_14 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String standardId = userInput.nextLine();
        double standardBaseFee = userInput.nextDouble();
        userInput.nextLine();

        String premiumId = userInput.nextLine();
        double premiumBaseFee = userInput.nextDouble();
        double insuranceFee = userInput.nextDouble();

        Shipping standard = new StandardShipping(standardId, standardBaseFee);
        Shipping premium = new PremiumShipping(premiumId, premiumBaseFee, insuranceFee);

        Shipping[] shippingList = { standard, premium };

        for (Shipping shipping : shippingList) {
            System.out.println(shipping.calculateTotalFee());
        }

        userInput.close();
    }
}
