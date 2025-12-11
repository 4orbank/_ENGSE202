package Lab1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab1_6 {
	public static void main(String[] args) {
		Scanner math = new Scanner(System.in);
		
	try {
		System.out.print("Enter your Number : ");
		int number =  math.nextInt();
		
		for (int i = 1; i <= 12; i++) {
			int result = number * i;
			System.out.println(number +  "x" + i + "=" + result);
		}
		
	} catch (InputMismatchException e) {
        System.out.println("Error: Please enter a valid integer.");
    }
	
		math.close();
		}
}
