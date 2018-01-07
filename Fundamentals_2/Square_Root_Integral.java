
package Fundamentals_2;

import java.util.Scanner;

public class Square_Root_Integral {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i<=n/2; i++){
			
			if((i*i) > n){
				System.out.print(i-1);
				return;
			}
			
		}
	}

}
