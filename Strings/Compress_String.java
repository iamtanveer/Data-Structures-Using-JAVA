package Strings;

public class Compress_String {

	public static String compress(String input){
		if(input == null){
			return input;
		}
		
		if(input.length() == 0){
			return "";
		}
		
		String output = input.charAt(0) + "";
		int count = 1;
		
		for(int i = 1; i < input.length(); i++){
			if(input.charAt(i) == input.charAt(i-1)){
				count++;
				if(i == input.length() - 1){
					output += count;
				}
			}else{
				if(count > 1){
					output += count + "" + input.charAt(i);
				}else{
					output += input.charAt(i);
				}
				count = 1;
			}
			
		}
		
		return output;
	}
	
	
	public static void main(String[] args) {
		System.out.println(compress("aaaabbbccd"));
	}

}
