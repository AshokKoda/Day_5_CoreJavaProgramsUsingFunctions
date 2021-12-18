package functionalPrograms;

import java.util.Scanner;

/*
 * 2D Array
 */
public class TwoDArray {
	
	public static void twoDarray() {
		int rows, columns, i,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		columns = sc.nextInt();
		
		int arr[][] = new int[rows][columns]; 
		System.out.println("Array elements is: ");
		
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) { 
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i < rows; i++) {
			System.out.println();
			for (j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + "\t");
			}
		}
	}

	public static void main(String[] args) {
		
		twoDarray();

	}

}
