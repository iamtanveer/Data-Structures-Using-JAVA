package Arrays_1;

import java.util.Arrays;

public class Pair_Sum {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,4,4,5,6,6};
		int n = 7;
//		pairSum(arr, n);
		pairSumEfficient(arr,n);
	}
	
	static void pairSumEfficient(int []arr, int num){
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length-1;
//		int arr[] = {1,2,2,3,3,4,4,5,6,6};
// 		int arr[] = {2,2,2,2,2}; sum = 4;
		
		while(start<end){
			if(arr[start] + arr[end] == num){
				if(arr[start] == arr[end]){
					int count = end - start + 1;
					int n = count -1;
					int totalCount = ((n)*(n+1) / 2);
					while(totalCount>0){
						System.out.println(arr[start] + " " + arr[end]);
						totalCount--;
					}
					start = end;
				}else{
					int countStart = 0, countEnd = 0;
					int temp = arr[start], i = start;
					while(arr[i] == temp && i<end){
						i++;
						countStart++;
					}
					temp = arr[end];
					int j = end;
					while(arr[j]==temp && j>start){
						j--;
						countEnd++;
					}
					start = i;
					end = j;
					int totalTimes = countStart * countEnd;
					while(totalTimes>0){
						System.out.println(arr[start-1]+ " " + arr[end+1]);
						totalTimes--;
					}
				}
			}else if(arr[start] + arr[end] < num){
				start++;
			}else{
				end--;
			}
		}
	}
	
	static void pairSum(int arr[], int n){
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				if(i!=j){
					if((arr[i]+arr[j])==n){
						if(arr[i]<arr[j]){
							System.out.println(arr[i]+ " "+ arr[j]);
						}else{
							System.out.println(arr[j]+ " " + arr[i]);
						}
					}
				}
			}
		}
	}

}
