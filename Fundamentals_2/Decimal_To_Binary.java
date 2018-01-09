package Fundamentals_2;

import java.util.Scanner;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int remainder = 0;
		long b = 0;
		long i = 1;
		
		while(n>=1){
			remainder = n%2;
			n = n/2;
			b = b + remainder * i;
			i = i * 10;
		}
		
		System.out.println(b);
	}

}
