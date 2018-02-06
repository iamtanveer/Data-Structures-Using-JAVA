package Search_And_Sort;

public class Insertion_Sort {

	public static void main(String[] args) {
		int arr[] = {8,4,5,1,3,7,6};
		sort(arr);
	}
	
	public static void sort(int arr[]){
		for(int i=1; i<arr.length; i++){
			int j = i-1;
			int temp = arr[i];
			
			while(j >=0 && arr[j]>temp){
				arr[j+1] = arr[j];
				j--;
				
			}
			arr[j+1] = temp;
		}
		print(arr);
	}
	
	public static void print(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}
