package primeFactors;

import java.util.Scanner;

public class PrimeFactorUsingFunction {
	
	static void checkPrimeFactors(int number) {
		
		for(int i = 2; i <= number; i++) {
			while(number % i == 0)
			{
				System.out.print(i + " ");
				number = number / i;
			}
		}
	}

	public static void main(String[] args) {
		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Number to find Prime Factors: ");
		num = sc.nextInt();
		System.out.println("Given Number is : " + num);
		System.out.println("Prime Factors are :");
		checkPrimeFactors(num);
	}

}
