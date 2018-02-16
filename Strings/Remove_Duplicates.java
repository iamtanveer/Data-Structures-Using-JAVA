package Strings;

public class Remove_Duplicates {
	
	public static String removeConsecutiveDuplicates(String input) {
		String str = "";
		
		for(int i = 1; i<input.length(); i++){
			
			if(i == 1){
				str += input.charAt(i);
			}
			
			if(input.charAt(i) == input.charAt(i-1)){
				continue;
			}
			
			str += input.charAt(i);
						
		}
		
		return str;
		
	}
	
	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("aaabbcccdeeee"));
	}

}
