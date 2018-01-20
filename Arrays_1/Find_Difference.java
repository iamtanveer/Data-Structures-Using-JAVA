package Arrays_1;

import java.util.Scanner;

public class Find_Difference {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}
		
		System.out.println(findDifference(arr));
	}
	
	public static int findDifference(int arr[]){
		int eSum = 0;
		int oSum = 0;
		
		for(int i=0; i<arr.length; i+=2){
			eSum += arr[i];
		}
		
		for(int i=1; i<arr.length; i+=2){
			oSum += arr[i];
		}
		
		return eSum-oSum;		
	}
	
	

}
