package Arrays_2;

public class Array_Rotation {

	public static void rotate(int arr[], int d){
		int temp[] = new int[d];
		for(int i=0; i<d; i++){
			temp[i] = arr[i]; 
		}
		
		for(int i=d; i<arr.length; i++){
			arr[i-d] = arr[i];
		}
		
		int k = 0;
		
		for(int i=arr.length - d; i<arr.length; i++){
			arr[i] = temp[k];
			k++;
		}
		
		for(int j=0; j<arr.length; j++){
			System.out.print(arr[j]+ " ");
		}
		
	}
	
	public static void rotateAlternateMethod(int arr[], int d){
		if(d>=arr.length){
			d = d % arr.length;
		}
		
		reverse(arr,0,arr.length-1);
		reverse(arr,0,arr.length-d-1);
		reverse(arr,arr.length-d, arr.length-1);
		
		//print
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void reverse(int arr[], int startIndex, int endIndex){
		int i=startIndex; 
		int j=endIndex;
		int temp;
		
		while(i<j){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
//		rotate(arr,4);
		rotateAlternateMethod(arr,8);
	}

}
