package Strings;

public class Count_Words {
	
    public static int countWords(String str){
    	int count = 0;
    	for(int i=0; i<str.length(); i++){
    		if(str.charAt(i)==' '){
    			count++;
    		}
    	}
    	
    	return count + 1;
    }
	
	public static void main(String args[]){
		String str = "This is a test string";
		System.out.print(countWords(str));
	}
	
}
