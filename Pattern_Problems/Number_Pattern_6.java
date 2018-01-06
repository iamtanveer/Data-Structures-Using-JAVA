/*
 * n = 4
	1234
	123
	12
	1
 */

package Pattern_Problems;

import java.util.Scanner;

public class Number_Pattern_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=n; i>=1; i--){
			for(int col = 1; col<=i; col++){
				System.out.print(col);
			}
			
			System.out.println();
		}
	}

}
