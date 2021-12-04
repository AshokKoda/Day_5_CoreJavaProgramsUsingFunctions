package powerOfTwo;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        if(n > 31)
        {
        	System.out.println("value of number should be less than 31");
        	return;
        }
        else
        {
        	for(int i=0 ; i<=n ; i++)
            {
                System.out.println(i + "\t" + ((int)(Math.pow(2,i))));
            }
        }

	}

}
