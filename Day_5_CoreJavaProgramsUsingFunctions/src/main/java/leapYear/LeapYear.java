package leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int Year;
		
		System.out.println("Enter Year: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Year= sc.nextInt();
		
		if (((Year % 4 == 0) && (Year % 100 != 0)) || (Year % 400 == 0))
	         System.out.println("Entered year is a Leap Year");
	      else
	         System.out.println("Entered year is a not Leap Year");

	}

}
