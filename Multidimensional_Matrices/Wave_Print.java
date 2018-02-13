package Multidimensional_Matrices;

import java.util.Scanner;

public class Wave_Print {

	public static void WavePrint(int input[][]){
		int numRows = input.length;
		int numCols = input[0].length;
		
		for(int j = 0; j < numCols; j++){
			if(j % 2 == 0){
				
				for(int i = 0; i < numRows; i++){
					System.out.print(input[i][j]+ " ");
				}
				
			}else{
				
				for(int i = numRows - 1; i >= 0 ; i--){
					System.out.print(input[i][j]+ " ");
				}
				
			}
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
		
		WavePrint(input);
	}

}
