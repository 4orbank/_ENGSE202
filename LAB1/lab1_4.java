package Lab1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab1_4 {
	public static void main(String[] args) {
		Scanner getscore = new Scanner (System.in);
		
		try {
			System.out.print("Enter you score (0-100) :");
			int score = getscore.nextInt();
			
			 if (score < 0 || score > 100) {
	                System.out.println("Error: Score must be between 0 and 100.");
	            } else if (score >= 80) {
	                System.out.println("You got the grade A");
	            } else if (score >= 70) {
	                System.out.println("You got the grade B");
	            } else if (score >= 60) {
	                System.out.println("You got the grade C");
	            } else if (score >= 50) {
	                System.out.println("You got the grade D");
	            } else {
	                System.out.println("You got the grade F");
	            }

	        } catch (InputMismatchException e) {
	            System.out.println("Err: Please enter a number only.");
	        }

	        getscore.close();
	    }
	}
