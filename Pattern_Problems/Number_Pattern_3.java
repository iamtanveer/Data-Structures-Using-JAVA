package Pattern_Problems;

import java.util.Scanner;

public class Number_Pattern_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++){
			for(int col = 1; col<=i; col++){
				System.out.print("1");
			}
			System.out.println();
		}
	}

}
