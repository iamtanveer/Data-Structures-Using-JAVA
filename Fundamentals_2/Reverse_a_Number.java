package Fundamentals_2;

import java.util.Scanner;

public class Reverse_a_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int remainder;
		int reversed = 0;
		
		while(n>=1){
			remainder = n % 10;
			reversed = reversed * 10 + remainder;
			n = n / 10;
		}
		
		System.out.print(reversed);
	}

}
