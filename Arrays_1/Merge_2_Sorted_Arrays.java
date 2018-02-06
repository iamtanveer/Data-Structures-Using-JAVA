package Arrays_1;

public class Merge_2_Sorted_Arrays {

	public static void merge(int arr1[], int arr2[]){
		int arr[] = new int[arr1.length + arr2.length];
		
		int i=0;
		int j=0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length){
			if(arr1[i]<=arr2[j]){
				arr[k] = arr1[i];
				i++;
				k++;
			}else{
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1.length){
			arr[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length){
			arr[k] = arr2[j];
			j++;
			k++;
		}
		
		for(int x = 0; x<arr.length; x++){
			System.out.print(arr[x]+ " ");
		}
	}
	
	public static void main(String[] args) {
		int a1[] = {1,4,7,8};
		int a2[] = {2,3,6,8};
		merge(a1, a2);
	}

}
