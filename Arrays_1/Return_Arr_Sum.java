package Arrays_1;

import java.util.Scanner;

public class Return_Arr_Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}
		
		System.out.println(sum(arr));
	}
	
	public static int sum(int arr[]){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		return sum;
	}

}
