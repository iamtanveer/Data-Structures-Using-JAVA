/*
 * n = 4
	1
	11
	121
	1221
 */

package Pattern_Problems;

import java.util.Scanner;

public class Number_Pattern_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("1");
		
		for(int i=1; i<n; i++){
			System.out.print("1");
			
			for(int twos = i-1; twos>0; twos--){
				System.out.print("2");
			}
			
			System.out.print("1");
			
			System.out.println();
		}
	}

}
