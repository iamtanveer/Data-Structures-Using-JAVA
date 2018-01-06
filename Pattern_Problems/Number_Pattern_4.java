/* n = 4
 * 1
   11
   202
   3003
 */

package Pattern_Problems;

import java.util.Scanner;

public class Number_Pattern_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("1");
		
		for(int i=1; i<n; i++){
			System.out.print(i);
			
			for(int z = i-1; z>0; z--){
				System.out.print("0");
			}
			
			System.out.println(i);
		}
	}

}
