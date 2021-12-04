package harmonicNumbers;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		
		double num,i;
		double sum=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextDouble();
		
		for( i=1;i<=num;i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("Harmonic value = "+sum);

	}

}
