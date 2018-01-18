package Pattern_Problems;

import java.util.Scanner;

public class Arrow_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int mid = n/2 + 1;
		
		for(int i = 1; i<=mid;i++){
			for(int spaces = 1; spaces<i; spaces++){
				System.out.print(" ");
			}
			for(int colStar = 1; colStar<=i; colStar++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = mid-1; i>=1; i--){
			for(int spaces = i-1; spaces>=1; spaces--){
				System.out.print(" ");
			}
			for(int colStar = i; colStar >=1; colStar--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
