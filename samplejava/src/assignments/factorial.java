package assignments;
import java.util.Scanner;

public class factorial 
{
	//static int num1=10;
	//static int num2=1;
	//static int i;
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");     
	    int num1=s.nextInt();

			//int num1=5;
			int num2=1;
			int i;
		for(i=num1;i>0;i--)
		{
			num2=i*num2;
		}
		factorial.display(num1,num2);
		
	}
	
	public static void display(int a,int b)
	{
		
		System.out.println("Factorial of " +a+ " is " +b);
		
	}

}
