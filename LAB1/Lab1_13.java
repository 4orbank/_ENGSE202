package Lab1;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Lab1_13 {
	public static void main(String[] args) {
        Scanner dashboard = new Scanner(System.in);

        try {
            System.out.print("Enter a rows (Row): ");
            int R = dashboard.nextInt();
            System.out.print("Enter a columns (Column): ");
            int C = dashboard.nextInt();

            if (R <= 0 || C <= 0) {
                System.out.println("Errr: Rows and Columns must be positive integers.");
            } else {
                int[][] grids = new int[R][C];

                System.out.println("Enter the status of each server (0=Offline, 1=Online):");
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        grids[i][j] = dashboard.nextInt();
                        if (grids[i][j] != 0 && grids[i][j] != 1) {
                            System.out.println("Invalid input! Only 0 or 1 is allowed.");
                            j--; 
                        }
                    }
                }

                int Count = 0;
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        if (grids[i][j] == 1) {
                            Count++;
                        }
                    }
                }

                System.out.println("Number of Online servers: " + Count);
            }

        } catch (InputMismatchException e) {
            System.out.println("Err: Please enter (0 or 1).");
        }

        dashboard.close();
    }
}
