package Lab3;

import java.util.Scanner;

class LicenseManager {

    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    // ตั้งค่าโควต้าสูงสุด
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

    // เบิก License
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

    // คืน License
    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    // แสดงสถานะ
    public static void displayStatus() {
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + (maxLicenses - usedLicenses));
    }
}

public class Lab3_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            switch (command) {
                case "SET":
                    int max = Integer.parseInt(sc.nextLine());
                    LicenseManager.setMax(max);
                    break;

                case "CHECKOUT":
                    LicenseManager.checkOut();
                    break;

                case "CHECKIN":
                    LicenseManager.checkIn();
                    break;

                case "STATUS":
                    LicenseManager.displayStatus();
                    break;
            }
        }

        sc.close();
    }
}
