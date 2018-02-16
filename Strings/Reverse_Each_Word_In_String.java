package Strings;

public class Reverse_Each_Word_In_String {
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Welcome to Github"));
	}
	
	public static String reverseWords(String input){
		String output = "";
		
		int index = 0;
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == ' '){
				index = i + 1;
				output += input.charAt(i);
			}else{
				output = output.substring(0, index) + input.charAt(i) + output.substring(index);
			}
		}
		
		return output;
	}

}
