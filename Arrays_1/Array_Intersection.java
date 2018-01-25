package Arrays_1;

import java.util.Arrays;

public class Array_Intersection {

	public static void main(String[] args) {
		int arr1[] = {2,2,8,5,4,3};
		int arr2[] = {2,2,4,7};
		arrIntersection(arr1, arr2); //O(m lg n) + O(n lg n) + O(m+n)
	}
	
	static void arrIntersection(int arr1[], int arr2[]){
		int i=0, j=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]==arr2[j]){
				System.out.println(arr1[i]);
				i++;
				j++;
			}else if(arr1[i]>arr2[j]){
				j++;
			}else{
				i++;
			}
		}
	}

}
