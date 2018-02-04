package Miscellaneous;

public class MaxSubArray {

	public static void main(String[] args) {
		int arr[] = {1,-4,3,-2,6};
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			if(sum<0){
				sum = arr[i];
			}else{
				sum += arr[i];
			}
			
			if(sum > max){
				max = sum;
			}	
		}
		System.out.println(max);
	}

}
