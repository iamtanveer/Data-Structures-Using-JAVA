/*
 * n = 3
 * 
    *
   ***
  *****
 */

package Pattern_Problems;

import java.util.Scanner;

public class Star_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++){
			for(int spaces = n-i; spaces>0; spaces--){
				System.out.print(" ");
			}
			for(int col = 1; col<=2*i-1; col++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
