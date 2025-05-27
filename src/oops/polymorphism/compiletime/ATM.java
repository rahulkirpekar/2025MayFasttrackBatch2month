package oops.polymorphism.compiletime;

// Method Overloadding ---static method
public class ATM 
{
	public static void withdraw(int amount) 
	{
		System.out.println("withdrawing " + amount +" using Debitcard.");
	}
	public static void withdraw(int amount,String accountNumber) 
	{
		System.out.println("withdrawing " + amount +" from account : " + accountNumber);
	}
	public static void withdraw(int amount , int otp) 
	{
		System.out.println("withdrawing " + amount +" using otp : " + otp);
	}
	
	public static void main(String[] args) 
	{
		ATM.withdraw(1000); 
	}
}
