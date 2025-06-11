package exceptiontopic;

// checked--compiletime Exception
//public class InvalidAgeException extends Exception

//Un-checked--Runtime Exception
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
