
package Fundamentals_1;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int start = s.nextInt();
		int end = s.nextInt();
		int gap = s.nextInt();
		
		double celsius = 0;
		
		for(int i=start; i<=end; i+=20){
			celsius = (i - 32) * (5.0/9.0);
			
			System.out.print(i + " ");
			System.out.println((int)celsius);
		}
		
		
	}

}
