package assignments;

public class customer 
{
	static int total;
	static int disct1;
	public static void main(String[] args) 
	{
		customer.totalamt(750, 1200, 280, 475,999);
		customer.discount();
	}
	
	public static void totalamt(int a,int b,int c,int d,int e)
	{
		total=a+b+c+d+e;
		System.out.println("Your Total Amount: " +total);
	}
	
	public static void discount()
	{
		if(total>5000)
		{
			int disct=(5000/100)*20;
			disct1=total-disct;
			System.out.println("Congragulations! You got " +disct + " discount on your purchase,");
			System.out.println("Your Amount after Discount is " +disct1);
		}
		
		
	}

}
