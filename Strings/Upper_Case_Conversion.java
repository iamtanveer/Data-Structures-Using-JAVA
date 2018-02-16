package Strings;

import java.util.Scanner;

public class Upper_Case_Conversion {

	public static String upperCase(String input){
		char c[] = input.toCharArray();
		for(int i = 0; i <c.length; i++){
			if(c[i] == ' '){
				if(c[i] == c[i+1]){
					continue;
				}else{
					c[i+1] = Character.toUpperCase(c[i+1]);
				}
			}
		}
		c[0] = Character.toUpperCase(c[0]);
		String s1 = new String(c);
		return s1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(upperCase(input));
	}

}
