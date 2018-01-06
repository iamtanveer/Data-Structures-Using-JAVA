/*
 * n = 5
 * 	
    1
   232
  34543
 4567654
567898765

 */

package Pattern_Problems;

import java.util.Scanner;

public class Triangle_of_Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int col = 0;
		
		for(int i = 1; i<=n; i++){
			for(int spaces = n-i; spaces>0; spaces--){
				System.out.print(" ");
			}
			for(col = i; col<=2*i-1; col++){
				System.out.print(col);
			}
			for(int rTriangle = col - 2; rTriangle>=i; rTriangle--){
				System.out.print(rTriangle);
			}
			System.out.println();
		}
	}

}
