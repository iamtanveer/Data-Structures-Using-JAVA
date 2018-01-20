package Arrays_1;

import java.util.Scanner;

public class Arrange_Numbers_In_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = arrange(n);
		
	}

	public static int[] arrange(int n){
		int arr[] = new int[n];
		int i = 0, j = n-1;
		int num = 1;
		while(i<j){
			arr[i] = num;
			num++;
			i++;
			
			arr[j] = num;
			num++;
			j--;
		}
		
		if(i==j){
			arr[i] = num;
		}
		
		print(arr);
		return arr;
	}
	
	public static void print(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
