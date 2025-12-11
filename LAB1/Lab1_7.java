package Lab1;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Iterator;

public class Lab1_7 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
	try {
		System.out.print("Enter N  : ");
		int n = num.nextInt();
		
		if (n <= 0) {
			System.out.println("err pls enter number must be a positive integer. ");
		}
		else {
			int sum = 0;
			
			for (int i = 1; i <= n; i++) {
				System.out.print("Enter a Number " + i + ": ");
				int inputnumber = num.nextInt();
				sum += inputnumber;
			}
			System.out.print("Sum = " + sum);
		}
		
	} catch (InputMismatchException e) {
        System.out.println("Error: Please enter a valid integer.");
    }
	
		num.close();
	}
       
}
