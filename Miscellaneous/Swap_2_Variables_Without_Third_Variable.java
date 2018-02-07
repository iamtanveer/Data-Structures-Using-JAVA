package Miscellaneous;

public class Swap_2_Variables_Without_Third_Variable {

	public static void swap(int a, int b){
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping: a->"+ a + "  b-> "+ b);
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		System.out.println("Before Swapping: a->"+ a + "  b-> "+ b);
		swap(a,b);
	}

}
