package upcastingDowncasting;

public class BankAccount {
	 private double balance;
	
	
	
	 public void deposite (double amount) {
		 
		 setBalance(getBalance() + amount);
		 
	 }
	 
	 public void withdraw (double amount) {
		 setBalance(getBalance() - amount);
	 }

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
