package functionalPrograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0, d = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		a = sc.nextInt();
		System.out.println("Enter b value: ");
		b = sc.nextInt();
		System.out.println("Enter c value: ");
		c = sc.nextInt();
		System.out.println("Enter d value: ");
		d = sc.nextInt();
		
		double distance = Math.sqrt(Math.pow(b - a, 2) + Math.pow(d - c, 2) * 1.0);
		
		System.out.println("Distance is = " + distance);
	}

}
