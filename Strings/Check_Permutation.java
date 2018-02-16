package Strings;

public class Check_Permutation {

	public static boolean checkPermutation(String s1, String s2){
		
		if(s1.length() != s2.length()){
			return false;
		}
		
		int arr[] = new int[256];
		
		for(int i = 0; i < s1.length(); i++){
			arr[s1.charAt(i)] += 1;
		}
		
		for(int i = 0; i < s2.length(); i++){
			arr[s2.charAt(i)] -= 1;
		}
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i]!=0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkPermutation("abcde", "bcadb"));
	}

}
