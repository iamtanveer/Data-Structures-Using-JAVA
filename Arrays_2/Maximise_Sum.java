package Arrays_2;

public class Maximise_Sum {
	
	public static long maximumSumPath(int arr1[], int arr2[]){
		int i = 0;
		int j = 0;
		int sum1 = 0;
		int sum2 = 0;
		long maxSum = 0;
		
		while(i<arr1.length && j<arr2.length){
			
			if(arr1[i]<arr2[j]){
				sum1 += arr1[i];
				i++;
			}else if(arr1[i]>arr2[j]){
				sum2 += arr2[j];
				j++;
			}else{
				maxSum += Math.max(sum1, sum2);
				sum1 = 0;
				sum2 = 0;
				while(i<arr1.length && j<arr2.length && arr1[i]==arr2[j]){
					maxSum += arr1[i];
					i++;
					j++;
				}
				
			}
		}
		
		while(i<arr1.length){
			sum1 += arr1[i];
			i++;
		}
		
		while(j<arr2.length){
			sum2 += arr2[j];
			j++;
		}
		
		maxSum += Math.max(sum1, sum2);
		return maxSum;
	}
	
	public static void main(String[] args) {
		int a1[] = {1,5,10,15,20,25};
		int a2[] = {2,4,5,9,15};
		System.out.println(maximumSumPath(a1, a2));
	}

}
