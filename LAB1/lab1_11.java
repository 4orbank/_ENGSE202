package Lab1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class lab1_11 {
	public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner getdata = new Scanner(System.in);

        try {
            System.out.print("Enter the number int: ");
            int N = getdata.nextInt();

            if (N <= 0) {
                System.out.println("Err: Enter number a positive integer.");
            } else {
                int[] numbers = new int[N];

                for (int i = 0; i < N; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = getdata.nextInt();
                }

                int sum = sumArray(numbers);

                System.out.println("Sum = " + sum);
            }

        } catch (InputMismatchException e) {
            System.out.println("Err: Pls enter a number only.");
        }

        getdata.close();
    }
}
