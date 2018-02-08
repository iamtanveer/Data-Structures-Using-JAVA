package Arrays_2;

public class Second_Largest_Element {

	public static int secondLargest(int arr[]){
		int max = arr[0];
		int sMax = Integer.MIN_VALUE;
		
		for(int i=1; i<arr.length; i++){
			if(arr[i]>sMax && arr[i]>max){
				sMax = max;
				max = arr[i];
			}else{
				if(arr[i]>sMax && arr[i]!=max){
					sMax = arr[i];
				}
			}
			
			
		}
		
		return sMax;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,8,6,5,7,9};
		System.out.println(secondLargest(arr));
	}

}
