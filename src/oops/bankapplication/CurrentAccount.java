package oops.bankapplication;

public class CurrentAccount extends BankAccount
{
	public CurrentAccount( String accountNumber, String accountHolder, double initialBalance) 
	{
		super(accountNumber, accountHolder, initialBalance);
	}
	@Override
	public void withdraw(double amount) 
	{
		if(amount <= balance ) 
		{
			balance = balance - amount;
			System.out.println(amount + " withdrawn from current account."); 
		}else 
		{
			System.out.println("Withdrwan failed. Insuffecient Balance.");
		}
	}
	@Override
	public void calculateInterest() 
	{
		System.out.println("No Interest for CurrentAccount.");
	}
}
