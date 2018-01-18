package Pattern_Problems;

import java.util.Scanner;

public class Number_Pattern_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k, j;
		
		for(int i=n; i>=1; i--){
			k = i;
			
			for(j = 1; j<=n; j++){
				if(k<=n){
					System.out.print(k);
				}else{
					System.out.print(n);
				}
				k++;
			}
			
			System.out.println();
		}
	}

}
