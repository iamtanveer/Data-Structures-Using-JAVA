package Strings;

public class Print_Substring {
	
	public static void printSubstring(String str){
		
		for(int start = 0; start < str.length(); start++){
			for(int end = start + 1; end <=str.length(); end++){
				System.out.println(str.substring(start, end));
			}
		}
		
	}
	
	public static void main(String[] args) {
		printSubstring("xyz");
	}

}
