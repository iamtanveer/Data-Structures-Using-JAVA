/*
 *	4
	*000*000*
	0*00*00*0
	00*0*0*00
	000***000
 
 */

package Pattern_Problems;

import java.util.Scanner;

public class Zeros_And_Stars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int k = n;
		
		for(int i = 1; i<=n; i++){
			for(k=1; k<=n; k++){
				if(k==i){
					System.out.print("*");
				}else{
					System.out.print("0");
				}
			}
			
			System.out.print("*");
			
			for(k=n; k>=1; k--){
				if(k==i){
					System.out.print("*");
				}else{
					System.out.print("0");
				}
			}
			
			System.out.println();
		}
	}

}
