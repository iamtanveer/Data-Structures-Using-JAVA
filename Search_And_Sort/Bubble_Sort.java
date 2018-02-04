package Search_And_Sort;

public class Bubble_Sort {

	public static void main(String[] args) {
		int arr[] = {1,5,4,3,9,6,0};
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int arr[]){
		int flag = 0;
		
		for(int k = 0; k < arr.length - 1; k++){
			flag = 0;
			for(int i = 0; i < arr.length - k - 1 ; i++){
				if(arr[i]>arr[i+1]){
					
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
					flag = 1;
				}
			}
			if(flag == 0){
				break;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

}
