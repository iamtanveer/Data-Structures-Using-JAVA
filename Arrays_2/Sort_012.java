package Arrays_2;

public class Sort_012 {

	public static void print(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void sort012(int arr[]){
		
		int i = 0;
		int nzero = 0;
		int ntwo = arr.length - 1;
		
		while(i<=ntwo){
			if(arr[i]==0){
				swap(arr,i,nzero);
				i++;
				nzero++;
			}else if(arr[i]==1){
				i++;
			}else{
				swap(arr,i,ntwo);
				ntwo--;
			}
		}
		
		print(arr);
	}
	
	public static void main(String[] args) {
		int arr[] = {0,1,2,0,2,0,1};
		sort012(arr);
	}

}
