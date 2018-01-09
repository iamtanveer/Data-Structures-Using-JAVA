package Fundamentals_2;

import java.util.Scanner;

public class Trailing_Zeros_In_Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int zeros = 0;
		
		for(int i = 5; n/i>=1; i*=5){
			zeros = n/i;
		}
		
//		ALTERNATE WAY is using the FLOOR function
//		for(int i=5; i<=n; i = i*5){
//			zeros += Math.floorDiv(n, i);
//		}
		
		System.out.println(zeros);
	}

}
