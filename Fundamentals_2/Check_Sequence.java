package Fundamentals_2;

import java.util.Scanner;

public class Check_Sequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int prev = s.nextInt();
		int current;
		boolean isDec = true;
		int count = 2;
		
		while(count<=n){
			current = s.nextInt();
			count++;
			
			if(current == prev){
				System.out.println("false");
				return;
			}
			
			if(current < prev){
				if(isDec == false){
					System.out.println("false");
					return;
				}
			}else{
				if(isDec == true){
					isDec = false;
				}
			}
			
			prev = current;
			
		}
		
		System.out.println("true");
	}

}
