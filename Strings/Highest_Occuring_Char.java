package Strings;

public class Highest_Occuring_Char {
	
	public static char highestOccuringCharacter(String input) {
		char ans = ' ';
		int arr[] = new int[256];
		
		for(int i = 0 ; i < input.length(); i++){
			arr[input.charAt(i)] += 1;
		}
		
		int max = -1;
		
		
		for(int i = 0; i < input.length(); i++){
			if(arr[input.charAt(i)] > max){
				max = arr[input.charAt(i)];
				ans = input.charAt(i);
			}
		}
		
		return ans;
		
	}	
	public static void main(String[] args) {
		System.out.println(highestOccuringCharacter("abdefgbabfba"));
	}

}
