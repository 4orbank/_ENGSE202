package Lab3;

import java.util.Scanner;

class User {

    private String password;

    public User(String initialPassword) {
        password = initialPassword;
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

        String initialPassword = sc.nextLine();
        String newPassword = sc.nextLine();

        User user = new User(initialPassword);
        user.setPassword(newPassword);

        System.out.println(user.getPassword());

        sc.close();
    }
}
