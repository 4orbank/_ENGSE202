package Lab1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab1_2 {
	public static void main(String[] args) {
		Scanner getnumber = new Scanner(System.in);
	try {
		System.out.print("Input Width : ");
		float width = getnumber.nextFloat();
		
		System.out.print("Input Height : ");
		float height = getnumber.nextFloat();
		
		float area = width * height;
		System.out.print("Your Area =" + area);

	}catch (InputMismatchException e) {
        System.out.print("Error: Please enter a valid number.");
    }
	
	getnumber.close();
	}
}
