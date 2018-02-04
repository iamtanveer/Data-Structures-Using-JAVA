package Search_And_Sort;

public class Binary_Search {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(binarySearch(arr, 7));
	}
	
	public static int binarySearch(int arr[], int n){
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		
		while(start<=end){
			mid = (start+end)/2;
			if(arr[mid]>n){
				end = mid-1;
			}else if(arr[mid]<n){
				start = mid+1;
			}else if(arr[mid]==n){
				return mid;
			}
		}
		
		return -1;
	}

}
