package oops.abstractiontopic.interfacetopic.task2;

public class EmailNotification implements Notification
{
	@Override
	public void send(String message) 
	{
		System.out.println("Sending Email with message: "+message);
	}
}
