package Arrays_2;

public class Check_Array_Rotation {

	public static int checkRotation(int arr[]){
		int counter = 0;
		
		for(int i=1; i<arr.length; i++){
			counter++;
			if(arr[i]<arr[i-1]){
				return counter;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		int arr[] = {5,6,1,2,3,4};
		int arr1[] = {3,6,8,9,10};
		System.out.println(checkRotation(arr));
		System.out.println(checkRotation(arr1));
	}

}
