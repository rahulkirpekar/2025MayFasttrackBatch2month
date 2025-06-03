package oops.bankapplication;

public class SavingAccount extends BankAccount
{
	private static final double MIN_BALANCE = 500;
	private static final double INTEREST_RATE = 0.05;
	
	public SavingAccount(String accountNumber, String accountHolder, double initialBalance) 
	{
		super(accountNumber, accountHolder, initialBalance);
	}
	@Override
	public void withdraw(double amount) 
	{
		if((balance - amount)> MIN_BALANCE) 
		{
			balance = balance - amount;
			System.out.println(amount +" withdrawn  from saving account.");
		}else 
		{
			System.out.println("Withdrwan failed. Minimum balance must be maintained.");
		}
	}
	@Override
	public void calculateInterest() 
	{
		double interest  = balance * INTEREST_RATE;
		balance = balance + interest;
		System.out.println("Interest of "+ interest +" added to saving account.");
	}
}
