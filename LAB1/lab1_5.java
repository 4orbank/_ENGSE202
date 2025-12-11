package Lab1;
import java.util.Scanner;

public class Lab1_5 {
	public static void main(String[] args) {
        Scanner getmenu = new Scanner(System.in);

        System.out.println("1 = Americano");
        System.out.println("2 = Latte");
        System.out.println("3 = Espresso");
        System.out.println("4 = Mocha");
        System.out.print("Enter your menu choice: ");

        int choicemenu = getmenu.nextInt();

        if (choicemenu < 1 || choicemenu > 4) {
            System.out.println("Error: Invalid Menu");
        } else if (choicemenu == 1) {
            System.out.println("You menu is Americano");
        } else if (choicemenu == 2) {
            System.out.println("You menu is Latte");
        } else if (choicemenu == 3) {
            System.out.println("You menu is Espresso");
        } else if (choicemenu == 4) {
            System.out.println("You menu is Mocha");
        }

        getmenu.close();
    }
}
