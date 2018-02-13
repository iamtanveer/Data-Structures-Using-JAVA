package Strings;

public class Minimum_Length_Word {

	public static String MinimumLengthWord(String input){
		int minStart = -1;
		int minLength = Integer.MAX_VALUE;
		int currStart = 0;
		int i = 0;
		
		for( ; i<input.length(); i++){
			if(input.charAt(i)==' '){
				int currWordLength = i - currStart;
				
				if(currWordLength < minLength){
					minStart = currStart;
					minLength = currWordLength;
				}
				
				currStart = i + 1;
			}
		}
		
		if(minStart == -1){
			return input;
		}else{
			int currWordLength = i - currStart;
			if(currWordLength < minLength){
				minStart = currStart;
				minLength = currWordLength;
			}
		}
		
		return input.substring(minStart, minStart + minLength);
	}
	
	public static void main(String[] args) {
		System.out.println(MinimumLengthWord("This code is written by Tanveer"));
	}

}
