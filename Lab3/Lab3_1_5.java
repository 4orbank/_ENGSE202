package Lab3;

import java.util.Scanner;

class Puchai {

    private String userName;
    private int failedLogin;
    private boolean locked;
    private static int maxTry = 3;

    public Puchai(String name) {
        this.userName = name;
        this.failedLogin = 0;
        this.locked = false;
    }

    public String getUserName() { return userName; }
    public boolean isLocked() { return locked; }
    public int getFailedLogin() { return failedLogin; }

    public static void setPolicy(int max) {
        if(max > 0) {
            maxTry = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public void login(String pass) {
        if(locked) {
            System.out.println("Account is locked.");
            return;
        }

        if(pass.equals("pass123")) {
            failedLogin = 0;
            System.out.println("Login successful.");
        } else {
            failedLogin++;
            int remain = maxTry - failedLogin;
            if(remain <= 0) {
                locked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                System.out.println("Login failed. " + remain + " attempts left.");
            }
        }
    }
}

public class Lab3_1_5 {
    public static void main(String[] args) {
        Scanner khor_nai = new Scanner(System.in); // เปลี่ยนชื่อสื่อความหมาย
        String nameInput = khor_nai.nextLine().trim();
        Puchai u1 = new Puchai(nameInput);

        int n = Integer.parseInt(khor_nai.nextLine().trim());
        for(int i = 0; i < n; i++) {
            String cmd = khor_nai.nextLine().trim();
            if(cmd.equals("SET_POLICY")) {
                int newMax = Integer.parseInt(khor_nai.nextLine().trim());
                Puchai.setPolicy(newMax);
            } else if(cmd.equals("LOGIN")) {
                String pw = khor_nai.nextLine().trim();
                u1.login(pw);
            } else {
                System.out.println("Unknown command: " + cmd);
            }
        }
        khor_nai.close();
    }
}
