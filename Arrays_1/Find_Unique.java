package Arrays_1;

import java.util.Scanner;

public class Find_Unique {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = {2,3,1,6,2,6,3};
		System.out.println(iterMethod(arr)); //O(n^2) complexity
		System.out.println(bitMethod(arr)); //O(n) complexity
		
	}
	
	static int bitMethod(int arr[]){
		int xor = 0;
		for(int i=0; i<arr.length; i++){
			xor = xor ^ arr[i];
		}
		return xor;
	}
	
	static int iterMethod(int arr[]){
		int flag = 0;
		for(int i=0; i<arr.length; i++){
			for(int j = 0; j<arr.length; j++){
				if(i!=j){
					if(arr[i]!=arr[j]){
						flag = 1;
					}else{
						flag = 0;
						break;
					}
				}
			}
			
			if(flag==1){
				return arr[i];
			}
		}
		
		return 0;
	}
}
