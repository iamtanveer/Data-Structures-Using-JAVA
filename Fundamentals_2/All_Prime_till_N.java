package Fundamentals_2;

import java.util.Scanner;

public class All_Prime_till_N {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for(int i=2; i<=n; i++){
			for(int j = 2; j<=i; j++){
				if(i==j){
					System.out.println(i);
				}
				if(i%j==0){
					break;
				}
			}
			
			
		}
	}

}
