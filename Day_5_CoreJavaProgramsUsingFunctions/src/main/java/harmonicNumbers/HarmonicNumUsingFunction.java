package harmonicNumbers;

import java.util.Scanner;

public class HarmonicNumUsingFunction {
	
	static double sum = 0;
	static void checkHarmonicNum(double n) {
		for( double i=1; i<=n; i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("Harmonic value = "+sum);
	}
	
	public static void main(String[] args) {
		
		double num;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextDouble();
		checkHarmonicNum(num);

	}

}
