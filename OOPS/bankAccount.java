package OOPS;

public class bankAccount {
	private String accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;
	
	public void deposit(double amount){
		this.balance += amount;
		System.out.println(amount + "$ deposited successfully! Updated Balance --> "+ this.balance);
	} 
	
	public void withdraw(double amount){
		if(this.balance - amount >= 0){
			this.balance -= amount;
			System.out.printf("Withdawal of " + amount + "$ process. Remaining balance --> "+ "%.2f",this.balance);
		}else{
			System.out.println("Only "+ this.balance+ "$ in your account. Cannot withdraw!");
		}
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}


