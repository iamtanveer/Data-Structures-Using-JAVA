import java.util.Scanner;

public class Strings_2 {

	public static void permutations(String input, String output){
		if(input.length() == 0){
			System.out.println(output);
			return;
		}
		
		for(int i = 0 ; i < input.length(); i++){
			permutations(input.substring(0, i) + input.substring(i+1), output + input.charAt(i));
		}
	} 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		permutations(input, "");
	}

}
