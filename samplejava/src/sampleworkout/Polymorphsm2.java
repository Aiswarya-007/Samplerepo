package sampleworkout;

public class Polymorphsm2 extends Polymorphsm1
{
	int a;
	int b;
	int c;
	public static void main(String[] args) 
	{
		
		Polymorphsm2 obj=new Polymorphsm2();
		obj.sum(10, 12);
		
	}
	
	public void sum(int a,int b)
	{
		super.sum(5,5);
		c=a+b;
		System.out.println("total: "+c);
	}

}
