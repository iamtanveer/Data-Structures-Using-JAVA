package Arrays_1;

import java.util.Arrays;

public class Triplet_Sum {

	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5,6,7};
		findTriplet(arr,12);
	}
	
	public static void findTriplet(int input[], int x){
		Arrays.sort(input);
		for(int i=0; i<input.length; i++){
			int st = i+1;
			int end = input.length - 1;
			int val = x - input[i];
			
			while(st<end){
				if(input[st] +input[end] < val){
					st++;
				}else if (input[st] + input[end] > val){
					end--;
				}else{
					int count1 = 0;
					int count2 = 0;
					for(int ptr = st; i<input.length; ptr++){
						if(input[ptr]==input[st]){
							count1++;
						}else{
							break;
						}
					}
					for(int ptr = end; ptr>=st; ptr--){
						if(input[ptr]==input[end]){
							count2++;
						}else{
							break;
						}
					}
					
					int combinations = count1 * count2;
					if(input[st]==input[end]){
						combinations = ((end-st+1) * (end-st)) / 2;
					}
					
					for(int k=0; k<combinations; k++){
						System.out.println(input[i] + " "+ input[st]+ " "+ input[end]);
					}
					
					st += count1;
					end -= count2;
				}
			}
		}
	}

}
