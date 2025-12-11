package Lab1;
import java.util.Scanner;

public class Lab1_1 {
	public static void main(String[] args) {
		Scanner getnumber = new Scanner(System.in);
		
		System.out.print("Enter you number1 : ");
		int number1 = getnumber.nextInt();
		
		System.out.print("Enter you number2 : ");
		int number2 = getnumber.nextInt();
		
		int sum = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " + sum);

		}
}
