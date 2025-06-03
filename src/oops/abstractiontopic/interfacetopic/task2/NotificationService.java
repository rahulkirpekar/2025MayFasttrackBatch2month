package oops.abstractiontopic.interfacetopic.task2;

public class NotificationService 
{
	public void notifyUser(Notification  notification , String msg) 
	{
		notification.send(msg);
	}
	public static void main(String[] args) 
	{
		NotificationService service = new NotificationService();

        Notification email = new EmailNotification();
    	Notification sms = new SMSNotification();
        Notification push = new PushNotification();

        // Decide notification type at runtime (could be user preference)
    	service.notifyUser(email, "Your order has been shipped!");
    	service.notifyUser(sms, "Your OTP is 1234");
    	service.notifyUser(push, "You have a new message");
	}
}
