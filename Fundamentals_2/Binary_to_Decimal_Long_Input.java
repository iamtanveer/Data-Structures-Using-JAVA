package Fundamentals_2;

import java.util.Scanner;

public class Binary_to_Decimal_Long_Input {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		
		System.out.println(binaryToDecimal(n));
	}
	
	static int binaryToDecimal(String n){
		String num = n;
		int dec_value = 0;
		
		int base = 1;
		int len = num.length();
		
		for(int i = len-1; i>=0; i--){
			if(num.charAt(i)=='0'){
				dec_value += 0 * base;
			}else{
				dec_value += 1 * base;
			}
			
			base = base * 2;
		}
		
		return dec_value;
	}

}
