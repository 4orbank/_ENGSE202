package Lab4;
import java.util.Scanner;

class Player {

    private String username;
    private int level;
    public Player() {
        this.username = "Guest";
        this.level = 1;
    }
    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}

public class Lab4_3 {
    public static void main(String[] args) {

        Scanner Getuser = new Scanner(System.in);

        int mode = Getuser.nextInt();
        Getuser.nextLine();

        Player player;

        if (mode == 1) {

            player = new Player();
        } else {
            String username = Getuser.nextLine();
            int level = Getuser.nextInt();
            player = new Player(username, level);
        }

        player.displayProfile();
    }
}
