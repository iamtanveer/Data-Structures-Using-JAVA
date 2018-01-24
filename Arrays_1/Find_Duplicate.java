package Arrays_1;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Duplicate {
	
	public static void main(String[] args) {
		int arr[] = {1,3,2,3,4,5};
		System.out.println(duplicate(arr)); //O(n log n) time
		System.out.println(duplicateArray(arr)); //O(n) time
		
	}
	
	static int duplicateArray(int arr[]){
		int tempArr[] = new int[arr.length];
		
		
		for(int i=0; i<arr.length; i++){
			
			if(tempArr[arr[i]]!=1){
				tempArr[arr[i]] = 1;
			}else{
				return arr[i];
			}
		}
		
		return 0;
	}
	
	static int duplicate(int arr[]){
		Arrays.sort(arr);
		
		for(int i=1; i<arr.length; i++){
			if(arr[i]==arr[i-1]){
				return arr[i];
			}
		}
		
		return 0;
	}
}
