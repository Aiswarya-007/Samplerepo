package assignments;

public class Encapsulation1 
{
	private int pin;
	
	public void setter(int pin)
	{
		this.pin=pin;		
	}
	
	public void getter()
	{
		if(pin==1001)
		{
			System.out.println("Pin is correct");
		}
		else if(pin==1234)
		{
			System.out.println("Pin is correct");
		}
		else if(pin==1212)
		{
			System.out.println("Pin is correct");
		}
		else
		{
			System.out.println("pin is not correct\nEnter a valid pin number");
		}
	}
	
	
}
