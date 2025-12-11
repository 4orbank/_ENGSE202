package Lab1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab1_12 {
	public static void main(String[] args) {
        Scanner pd = new Scanner(System.in);

        try {
            System.out.print("Enter the number of products : ");
            int N = pd .nextInt();

            if (N <= 0) {
                System.out.println("Err: Enter positive number.");
            } else {
                int[] proIds = new int[N];
                int[] sq = new int[N];

                for (int i = 0; i < N; i++) {
                    System.out.print("Enter Product ID : " + (i + 1) + ": ");
                    proIds[i] = pd.nextInt();

                    System.out.print("Enter Stock Quantity :  " + (i + 1) + ": ");
                    sq[i] = pd.nextInt();
                }

                System.out.print("Pls enter Product ID to search: ");
                int searchID = pd .nextInt();

                boolean found = false;
                for (int i = 0; i < N; i++) {
                    if (proIds[i] == searchID) {
                        System.out.println("Stock Quantity = " + sq[i]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Product " + searchID + " not found");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Err: Please enter number only.");
        }

        pd.close();
    }
}
