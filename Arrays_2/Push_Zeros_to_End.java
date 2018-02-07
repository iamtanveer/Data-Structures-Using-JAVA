package Arrays_2;

public class Push_Zeros_to_End {
	
	public static void pushZerosAtEnd(int arr[]){
		int i = 0;
		int j = 0;
		int temp = 0;
		
		while(i<arr.length && j<arr.length){
			if(arr[i]!=0){
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j++;
			}else{
				i++;
			}
		}
		
		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k] + " ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,6,0,0,1,9,0,8,0};
		pushZerosAtEnd(arr);
	}

}
