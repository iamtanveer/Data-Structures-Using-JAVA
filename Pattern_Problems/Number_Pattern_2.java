/*
 *     1
 *    23
 *   345
 *  4567
 *  
 * n = 4
 * 
 */

package Pattern_Problems;

import java.util.Scanner;

public class Number_Pattern_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int row = 1; row<=n; row++){
			for(int spaces = n-row; spaces>0; spaces--){
				System.out.print(" ");
			}
			for(int col = row; col<=2*row - 1; col++){
				System.out.print(col);
			}
			
			System.out.println();
		}
	}

}
