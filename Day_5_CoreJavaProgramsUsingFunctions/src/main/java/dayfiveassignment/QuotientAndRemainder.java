package dayfiveassignment;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		
		int Num1, Num2;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter entered number is: ");
		Num1 = sc.nextInt();
		System.out.println("Division by number: ");
		Num2 = sc.nextInt();
		
		int quotient = Num1 / Num2;
		int remainder = Num1 % Num2;
		System.out.println("After division the quotient and remainder are: ");
		
		System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);

	}

}
