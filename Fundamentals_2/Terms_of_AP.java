/*
 * program to print first x terms of the series 3N + 2 which are not multiples of 4.
 */

package Fundamentals_2;

import java.util.Scanner;

public class Terms_of_AP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int counter = 1;
		int i = 1;
		int sol;

		while(counter<=x){
			sol = 3*i + 2;
			i++;
			if(sol%4==0){
				continue;
			}else{
				System.out.print(sol+ " ");
				counter++;
			}
		}
		
		
	}

}
