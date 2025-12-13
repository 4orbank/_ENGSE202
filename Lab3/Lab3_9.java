package Lab3;

class username {

    private String username;
    private String password;

    private static int minPasswordLength = 8;

    public username(String username, String password) {
        this.username = username;

        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
    }
}

public class Lab3_9 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int minLength1 = sc.nextInt();
        sc.nextLine();

        String user1_name = sc.nextLine();
        String user1_pass = sc.nextLine();

        String user2_name = sc.nextLine();
        String user2_pass = sc.nextLine();

        int minLength2 = sc.nextInt();
        sc.nextLine();

        String user2_newPass = sc.nextLine();

        username.setMinLength(minLength1);

        username user1 = new username(user1_name, user1_pass);
        username user2 = new username(user2_name, user2_pass);

        username.setMinLength(minLength2);
        user2.setPassword(user2_newPass);

        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());

        sc.close();
    }
}
