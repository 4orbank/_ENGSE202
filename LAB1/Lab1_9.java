package Lab1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab1_9 {
	public static void main(String[] args) {
        Scanner getnum = new Scanner(System.in);

        try {
            System.out.print("Enter the number of integers : ");
            int N = getnum.nextInt();

            if (N <= 0) {
                System.out.println("Err: Input positive integer.");
            } else {
                int[] nb = new int[N];
                int sum = 0;

                for (int i = 0; i < N; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    nb[i] = getnum.nextInt();
                    sum += nb[i]; 
                }

                double avg = (double) sum / N;

                System.out.println("Average = " + avg);
            }

        } catch (InputMismatchException e) {
            System.out.println("Err: Please enter a integer.");
        }

        getnum.close();
    }
}
