/*
 * n = 5
	5432*
	543*1
	54*21
	5*321
	*4321
 */

package Pattern_Problems;

import java.util.Scanner;

public class Number_Star_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = n;
		
		for(int i = 1; i<=n; i++){
			for(k=n; k>=1; k--){
				if(k!=i){
					System.out.print(k);
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
