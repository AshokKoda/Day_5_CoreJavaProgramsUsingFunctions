package functionalPrograms;
import static java.lang.Math.*;

import java.util.Scanner;  

/*
 * Quadratic
 */
public class Quadratic {
	
	//static method that finds the roots of the quadratic equation 
	public static void calculateQuadratic(int a, int b, int c) {
		
		//if a is 0 then the equation is not quadratic
		if(a == 0) {
			System.out.println("The value of a cannot be 0.");  
			return;
		}
		
		int delta = b * b - 4 * a * c;
		double sqrtval = sqrt(abs(delta)); 
		
		if (delta > 0)   
		{  
		System.out.println("The roots of the equation are real and different. \n");  
		System.out.println((double)(-b + sqrtval) / (2 * a) + "\n"+ (double)(-b - sqrtval) / (2 * a));  
		}
		else if (delta == 0)   
		{  
		System.out.println("The roots of the equation are real and same. \n");  
		System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
		}  
		
		//if delta < 0
		else   
		{  
		System.out.println("The roots of the equation are complex and different. \n");  
		System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
		}  
	}

	public static void main(String[] args) {
		
		int a, b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		a = sc.nextInt();
		System.out.println("Enter b value: ");
		b = sc.nextInt();
		System.out.println("Enter c value: ");
		c = sc.nextInt();
		
		calculateQuadratic(a, b, c);

	}

}
