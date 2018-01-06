package Fundamentals_1;

import java.util.Scanner;

public class Sum_Even_Odd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int remainder = 0;
		int EvenSum = 0, OddSum = 0;
		
		while(n>=1){
			remainder = n % 10;
			if(remainder%2==0){
				EvenSum+=remainder;
			}else{
				OddSum+=remainder;
			}
			n = n/10;
		}
		
		System.out.println(EvenSum+ " " + OddSum);
	}

}
