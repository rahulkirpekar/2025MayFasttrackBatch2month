package oops.bankapplication;

public abstract class BankAccount 
{
	private String accountHolder;
	private String accountNumber;
	protected double balance;
	
	public BankAccount(String accountNumber, String accountHolder, double balance) 
	{
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void deposit(double amount)
	{
		if(amount > 0) 
		{
			balance = balance + amount;
			System.out.println(amount + " is deposited.");
		}else 
		{
			System.out.println("Invalid deposite amount.");
		}
	}
	
	public abstract void withdraw(double amount);
	public abstract void calculateInterest();

	public void chheckBalance() 
	{
		System.out.println("Current Balance is : "+ balance);
	}
}
