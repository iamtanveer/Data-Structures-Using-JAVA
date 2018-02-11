package Strings;

public class Replace_Char {

	public static String replaceCharacter(String input, char c1, char c2) {
		String str = "";
		
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i)==c1){
				str += c2;
			}else{
				str += input.charAt(i);
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		System.out.print(replaceCharacter("String", 'i', 'n'));
	}

}
