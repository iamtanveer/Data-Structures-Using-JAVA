package Multidimensional_Matrices;

import java.util.Scanner;

public class Largest_Row_Or_Column {

	public static void findLargest(int input[][]){
		int maxr = Integer.MIN_VALUE;
		int maxc = Integer.MIN_VALUE;
		int numRows = input.length; 
		int numCols = input[0].length;
		int rowNumber = 0;
		int colNumber = 0;
		
		for(int i = 0; i<numRows; i++){
			int sum = 0;
			for(int j = 0; j < numCols; j++){
				sum += input[i][j];
			}
			if(sum>maxr){
				maxr = sum;
				rowNumber = i;
			}
		}
		
		for(int j = 0; j<numCols; j++){
			int sum = 0;
			for(int i = 0; i<numRows; i++){
				sum += input[i][j];
			}
			if(sum>maxc){
				maxc = sum;
				colNumber = j;
			}
		}
		
		if(maxr > maxc) {
			System.out.println("row "+ rowNumber + " " + maxr);
		}else{
			System.out.println("col "+ colNumber + " " + maxc);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numRows = s.nextInt();
		int numCols = s.nextInt();

		int input[][] = new int[numRows][numCols];
		
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		
		findLargest(input);
	}

}
