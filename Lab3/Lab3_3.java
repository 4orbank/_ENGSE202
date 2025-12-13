package Lab3;

import java.util.Scanner;

// คลาส Name สำหรับจำลองการตั้งรหัสผ่าน
class Name {

    private String password;

    public Name(String initialPassword) {
        this.password = initialPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}

public class Lab3_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String initialPassword = sc.nextLine();

        System.out.print("Enter new password: ");
        String newPassword = sc.nextLine();

        // ใช้คลาส Name แทน User
        Name name = new Name(initialPassword);
        name.setPassword(newPassword);

        System.out.println("Current password: " + name.getPassword());

        sc.close();
    }
}
