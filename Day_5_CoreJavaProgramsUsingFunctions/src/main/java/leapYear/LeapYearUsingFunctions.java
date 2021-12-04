package leapYear;

import java.util.Scanner;

public class LeapYearUsingFunctions {

	static void checkLeapYear() {
		int Year;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year either check leap year or not:");
		Year = sc.nextInt();
		System.out.println("Given Year is: " + Year);
		
		if (((Year % 4 == 0) && (Year % 100 != 0)) || (Year % 400 == 0))
	         System.out.println(Year + " is a Leap Year");
	      else
	         System.out.println(Year +  " is a not Leap Year");
	}
	
	public static void main(String[] args) {
		checkLeapYear();
	}

}
