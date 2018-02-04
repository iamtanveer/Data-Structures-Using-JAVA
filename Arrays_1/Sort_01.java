package Arrays_1;

public class Sort_01 {

	public static void main(String[] args) {
		int arr[] = {1,1,1,1,1,0};
		sort(arr);
	}
	
	public static void sort(int arr[]){
		int i=0;
		int j = arr.length-1;
		
		while(i<j){
			if(arr[i]==0){
				i++;
			}else{
				if(arr[j]==1){
					j--;
				}else{
					swap(i,j,arr);
				}
			}
		}
		
		print(arr);
	}
	
	public static void swap(int i, int j, int arr[]){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void print(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
	}

}
