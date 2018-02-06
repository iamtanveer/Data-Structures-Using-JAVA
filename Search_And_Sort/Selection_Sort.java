package Search_And_Sort;

public class Selection_Sort {

	public static void main(String[] args) {
		int arr[] = {8,4,2,1,3,7,5,6};
		sort(arr);
	}
	
	public static void sort(int arr[]){
		int temp;
		
		for(int i=0; i<arr.length-1; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[j]<arr[i]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		print(arr);
	}
	
	public static void print(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}
