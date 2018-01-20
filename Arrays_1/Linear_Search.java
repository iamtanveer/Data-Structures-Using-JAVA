package Arrays_1;

import java.util.Scanner;

public class Linear_Search {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}
		int num = s.nextInt();
		System.out.println(linearSearch(arr, num));
	}
	
	public static int linearSearch(int arr[], int num){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==num){
				return i;
			}
		}
		
		return -1;
	}
}
