package Fundamentals_2;

import java.util.Scanner;

public class Nth_Fibonacci_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Nth_Fib(n));
	}
	
	static int Nth_Fib(int n){
		int a = 0; 
		int b = 1;
		int c = 0; //any random_value
		
		if(n==0){
			return a;
		}
		
		for(int i = 2; i<=n; i++){
			c = a + b;
			a = b;
			b = c;
		}
		
		return c;
	}

}
