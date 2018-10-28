package upcastingDowncasting;

public class Startup {
	
	  public static void main(String[] args) {
	       
			/*	int a=100; this is called implict typecast
			long b= a;
			long c = 1000000000;
			int d= (int)c; this is called explixit typecast
		*/
			
			
			
			BankAccount b = new BankAccount();
					
			

			//b. dele bankAccount ar sob pacce
			
			
			
			SavingsAccount s1 = new SavingsAccount();
			//s1. dele Bank+Saving ar sob peye jacce
			s1.setInterestRate(12.5);
			s1.deposite(23000.0);
			
			
			
			
			
			
			
			//BankAccount b1 = new SavingAccount();
			BankAccount b1 = s1;  //upcasting
			double balance = b1.getBalance();
			
			//last stage
			b1.deposite(200);// j kono programmer dekle bolbe ata kar method BankAccount ar method
			// b1.getinterstrate ase a na
			
			//SavingsAccount s2 = b1;   ata vol dorbe
			
			SavingsAccount s2 = (SavingsAccount)b1; //downcasting
			
			s2.getInterestRate();
			
			
			
			BankAccount b2 = new CheckingAccount();
	        
	        
	    }
	

}
