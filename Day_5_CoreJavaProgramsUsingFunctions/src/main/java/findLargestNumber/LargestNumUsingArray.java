package findLargestNumber;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumUsingArray {

	public static void main(String[] args) {
		int i;
        int [] arr = new int[3];
        for(i=0;i<arr.length;i++) {
            System.out.println("Enter your  +ve integer: ");
            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Maximum = " + arr[arr.length - 1]);

	}

}
