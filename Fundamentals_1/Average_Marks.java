package Fundamentals_1;

import java.util.Scanner;

public class Average_Marks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char name = s.next().charAt(0);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int average = (a+b+c)/3;
		System.out.println("Hi " + name+ ". Your Average score is: "+ average);
	}

}
