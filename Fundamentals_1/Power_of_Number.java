package Fundamentals_1;

import java.util.Scanner;

public class Power_of_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int result = 1;
		
		for(int i=y; i>0; i--){
			result*=x;
		}
		
		System.out.println(result);
		
	}

}
