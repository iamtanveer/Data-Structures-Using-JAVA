package OOPS;

public class bankingMain {

	public static void main(String[] args) {
		bankAccount user1 = new bankAccount();
		user1.setName("Steve Jobs");
		user1.setAccountNumber("037819");
		user1.setBalance(100.00);
		user1.setPhoneNumber("9411987390");
		user1.setEmail("abc@apple.com");
		
		user1.deposit(200);
		user1.withdraw(29);
		
		
	}

}
