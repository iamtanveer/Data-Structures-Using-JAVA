package Arrays_1;

import java.util.Scanner;

public class Swap_Alternate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}
		swap(arr);
		
	}
	
	
	public static void swap(int arr[]){
		for(int i=1; i<arr.length; i+=2){
			int temp = arr[i-1];
			arr[i-1] = arr[i];
			arr[i] = temp;
		}
		print(arr);
	}
	
	public static void print(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
