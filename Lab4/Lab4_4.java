package Lab4;
import java.util.Scanner;

class Location {

    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(Location sourceLocation) {
        this.latitude = sourceLocation.latitude;
        this.longitude = sourceLocation.longitude;
    }

    public void setLatitude(double newLatitude) {
        latitude = newLatitude;
    }

    public void displayInfo() {
        System.out.println("Lat: " + latitude + ", Lon: " + longitude);
    }
}

public class Lab4_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double initialLatitude = input.nextDouble();
        double initialLongitude = input.nextDouble();
        double updatedLatitude = input.nextDouble();

        Location originalLocation = new Location(initialLatitude, initialLongitude);
        Location copiedLocation = new Location(originalLocation);

        originalLocation.setLatitude(updatedLatitude);

        originalLocation.displayInfo();
        copiedLocation.displayInfo();
    }
}
