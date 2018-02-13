package Multidimensional_Matrices;

import java.util.Scanner;

public class Row_Wise_Sum {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int numRows = s.nextInt();
		int numCols = s.nextInt(); 
		int arr[][] = new int[numRows][numCols];
		
		for(int i = 0; i < numRows ; i++){
			for(int j = 0 ; j < numCols; j++){
				arr[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < numRows; i++){
			int sum = 0;
			for(int j = 0; j < numCols; j++){
				sum += arr[i][j];
			}
			System.out.print(sum+ " ");
		}
		
	}

}
