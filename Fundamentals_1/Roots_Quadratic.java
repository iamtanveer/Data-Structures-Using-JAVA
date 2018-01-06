package Fundamentals_1;

import java.util.Scanner;

public class Roots_Quadratic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		double d = (b*b)-(4*a*c);
		
		double r1 = (-b + Math.sqrt(d))/(2*a);
		double r2 = (-b - Math.sqrt(d))/(2*a);
		
		if(d<0){
			System.out.println("-1");
		}else if(d==0){
			System.out.println("0");
		}else{
			System.out.println("1");
		}
		
		int x = (int)Math.round(r1);
		int y = (int)Math.round(r2);
		
		if(x==0 && y==0){
	          return;
	    }
		System.out.println(x+ " "+ y);
	}

}
