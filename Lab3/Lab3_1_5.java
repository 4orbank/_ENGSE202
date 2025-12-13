package Lab3;

import java.util.Scanner;

// เปลี่ยนชื่อ class จาก User -> LabUser
class LabUser {

    private String username;
    private int failedAttempts;
    private boolean isLocked;
    private static int maxAttempts = 3;

    public LabUser(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public void login(String password) {
        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }
        if ("pass123".equals(password)) {
            failedAttempts = 0;
            System.out.println("Login successful.");
        } else {
            failedAttempts++;
            if (failedAttempts >= maxAttempts) {
                isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                System.out.println("Login failed. " + (maxAttempts - failedAttempts) + " attempts left.");
            }
        }
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }
}

public class Lab3_1_5 { // ชื่อไฟล์ต้องตรง
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        LabUser u = new LabUser(username);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            if ("SET_POLICY".equals(command)) {
                int max = Integer.parseInt(sc.nextLine());
                LabUser.setPolicy(max);
            } else if ("LOGIN".equals(command)) {
                String password = sc.nextLine();
                u.login(password);
            }
        }

        sc.close();
    }
}
