package Fundamentals_2;

import java.util.Scanner;

public class Sum_or_Product {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number n: ");
		int n = s.nextInt();
		
		System.out.println("Enter '1' for SUM till N or '2' for PRODUCT till N");
		int c = s.nextInt();
		
		switch (c) {
		case 1:
			int sum = 0;
			for(int i=1; i<=n; i++){
				sum+=i;
			}
			System.out.println(sum);
			break;
			
		case 2:
			int product = 1;
			for(int i=1; i<=n; i++){
				product*=i;
			}
			System.out.println(product);
			break;
			
		default:
			break;
		}
	}

}
