package Lab3;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

class User {
    private String username;

    public User(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
}

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner inpuser = new Scanner(System.in);
        
        System.out.print("input User Name : ");
        String name = inpuser.nextLine();
        
        User u = new User(name);
        System.out.println(u.getUsername());
    }
}
