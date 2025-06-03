package oops.bankapplication;

public class BankService 
{
	public static void main(String[] args) 
	{
		BankAccount kohliSavingAccount = new SavingAccount("101", "Kohli", 100000);
		BankAccount dhoniCurrentAccount = new CurrentAccount("201", "Dhoni", 200000);

		
		kohliSavingAccount.deposit(1000);
		kohliSavingAccount.withdraw(2000);
		kohliSavingAccount.calculateInterest();
		kohliSavingAccount.chheckBalance();

		System.out.println("-----------------------------------------------------------");

		dhoniCurrentAccount.deposit(5000);
		dhoniCurrentAccount.withdraw(10000);
		dhoniCurrentAccount.calculateInterest();
		dhoniCurrentAccount.chheckBalance();

	}
}
