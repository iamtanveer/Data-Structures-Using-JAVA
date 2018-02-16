package Strings;

public class Remove_Char {

	public static String removeCharacters(String input, char x){
		String str = "";
		
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == x){
				continue;
			}else{
				str += input.charAt(i);
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		System.out.print(removeCharacters("Welcome to Github", 'o'));
	}

}
