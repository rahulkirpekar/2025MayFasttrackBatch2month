package oops.abstractiontopic.interfacetopic.task2;

public class SMSNotification implements Notification
{
	@Override
	public void send(String message) 
	{
		System.out.println("Sending SMS with message : " + message);
	}

}
