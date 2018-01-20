package Fundamentals_2;

import java.util.Scanner;

public class Check_Armstrong {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(CheckArmstrong(n));
	}
	
	public static boolean CheckArmstrong(int n){
		
		int length = 0;
		int temp = n;
		int temp2 = n;
		int rem = 0;
		int sum = 0;
		
		while(temp>=1){
			length++;
			temp = temp/10;
		}
		
		while(temp2>=1){
			rem = temp2 % 10;
			temp2 /= 10;
			sum = sum + (int) Math.pow(rem, length);
		}
		
		if(sum==n){
			return true;
		}else{
			return false;
		}
	}
}
