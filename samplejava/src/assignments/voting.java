package assignments;

public class voting 
{

	public static void main(String[] args) 
	{
		boolean eligible=true;
		eligible=voting.eligibility(8);
		if(eligible==true)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		
	}
	
	public static boolean eligibility(int age)
	{
		boolean val=true;
		System.out.println("Your age is "+age);
		if(age>18)
		{
			System.out.println("You are Eligible for Voting");
			return val;
			//System.out.println(val);
		}
		else
		{
			System.out.println("You are Not-Eligible for Voting");
			val=false;
			return val=false;
			
		}
	}

}
