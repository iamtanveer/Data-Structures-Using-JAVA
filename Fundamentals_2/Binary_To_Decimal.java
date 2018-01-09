package Fundamentals_2;

import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		int remainder;
		int d = 0;
		int base = 1;
		
		while(b>=1){
			remainder = b % 10;
			b = b / 10;
			d = d + remainder*base;
			base = base * 2;
		}
		
		System.out.println(d);
	}

}
