package Lab3;

import java.util.Scanner;

class BaiAnuyard {

    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMax(int max) {
        if (max < 0) {
            System.out.println("Invalid max value.");
        } else if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
        } else {
            maxLicenses = max;
            System.out.println("Max licenses set to " + max);
        }
    }

    public static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }
    }

    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    public static void displayStatus() {
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + (maxLicenses - usedLicenses));
    }
}

public class Lab3_13 {
    public static void main(String[] args) {

        Scanner khor_nai = new Scanner(System.in);
        int jam_kham_sang = 0;

        try {
            jam_kham_sang = Integer.parseInt(khor_nai.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input.");
            khor_nai.close();
            return;
        }

        for (int i = 0; i < jam_kham_sang; i++) {
            String kam_sang = khor_nai.nextLine().trim();

            switch (kam_sang) {
            case "SET":
              try {
                int max_mai = Integer.parseInt(khor_nai.nextLine().trim());
                BaiAnuyard.setMax(max_mai);
              } catch (NumberFormatException e) {
                System.out.println("SET value is not a number, skipping.");
              }
              break;

            case "CHECKOUT":
              BaiAnuyard.checkOut();
              break;

            case "CHECKIN":
              BaiAnuyard.checkIn();
              break;

            case "STATUS":
              BaiAnuyard.displayStatus();
              break;

            default:
              System.out.println("Unknown command, skipping.");
            }
        }

        khor_nai.close();
    }
}
