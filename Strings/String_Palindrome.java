package Strings;

public class String_Palindrome {

	public static boolean checkPalindrome(String str){
		int i = 0;
		int j = str.length() - 1;
		
		while(i<j){
			if(str.charAt(i)==str.charAt(j)){
				i++;
				j--;
			}else{
				break;
			}
		}
		
		if(i>j || i==j){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(checkPalindrome("namans"));
	}

}
