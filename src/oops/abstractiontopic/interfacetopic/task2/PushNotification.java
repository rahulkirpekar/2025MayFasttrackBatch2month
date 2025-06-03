package oops.abstractiontopic.interfacetopic.task2;
public class PushNotification implements Notification
{
	@Override
	public void send(String message) 
	{
		System.out.println("Sending Push Notification with message: " +  message);
	}
}
