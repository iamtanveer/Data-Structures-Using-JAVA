package Arrays_2;

public class Sum_Of_Two_Arrays {

	public static int[] sumOfTwoArrays(int arr1[], int arr2[]){
		
		int sum[] = new int[Math.max(arr1.length, arr2.length) + 1];
		
		int l1= arr1.length-1;
		int l2 = arr2.length-1;
		int l3 = sum.length - 1;
		int carry = 0;
		
		while(l3>=0){
			if(l1>=0 && l2 >=0){
				sum[l3] = carry + arr1[l1] + arr2[l2];
				if(sum[l3]>9){
					carry = 1;
					sum[l3] %= 10;
				}else{
					carry = 0;
				}
				l1--;
				l2--;
				l3--;
 			}else if(l1<0 && l2>=0){
 				sum[l3] = carry + arr2[l2];
 				if(sum[l3]>9){
					carry = 1;
					sum[l3] %= 10;
				}else{
					carry = 0;
				}
 				l2--;
 				l3--;
 			}else if(l2<0 && l1>=0){
 				sum[l3] = carry + arr1[l1];
 				if(sum[l3]>9){
 					carry = 1;
 					sum[l3] %= 10;
 				}else{
 					carry = 0;
 				}
 				l1--;
 				l3--;
 			}else{
 				sum[l3] = carry;
 				l3--;
 			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int arr1[] = {6,2,4};
		int arr2[] = {7,5,6};
		int sum[] = sumOfTwoArrays(arr1, arr2);
		Sort_012.print(sum);
	}
	
}
