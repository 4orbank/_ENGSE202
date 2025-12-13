package Lab3;

import java.util.Scanner;

class User {

    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class Lab3_1 {

    public static void main(String[] args) {

        Scanner inpuser = new Scanner(System.in);

        String name = inpuser.nextLine();

        User u = new User(name);
        System.out.println(u.getUsername());

        inpuser.close();
    }
}
