package Multidimensional_Matrices;

import java.util.Scanner;

public class Spiral_Print {

	public static void spiralPrint(int input[][]){
		
		int row = input.length;
		int col = input[0].length;
		int i, rowStart = 0, colStart = 0;
		int numberOfElements = row * col, count = 0;
		System.out.println(row);
		
		while(count < numberOfElements){
			
			for(i = colStart; count < numberOfElements && i < col; i++){
				System.out.print(input[rowStart][i]+ " ");
				count++;
			}
			rowStart++;
			
			for(i = rowStart; count < numberOfElements && i < row; i++){
				System.out.print(input[i][col - 1]+ " ");
				count++;
			}
			col--;
			
			for(i = col-1; count < numberOfElements && i>= colStart; i--){
				System.out.print(input[row-1][i]+ " ");
				count++;
			}
			row--;
			
			for(i = row-1; count < numberOfElements && i >=rowStart; i--){
				System.out.print(input[i][colStart]+ " ");
				count++;
			}
			colStart++;
			
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
		
		spiralPrint(input);
	}

}
