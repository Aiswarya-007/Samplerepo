package assignments;

public class AverageArea 
{

	public static void main(String[] args) 
	{
		AverageArea.average(10, 12, 5);
		float avg1=AverageArea.average(1.4f, 3.6f, 9.0f);
		System.out.println("Average of three Float numbers = " +avg1);
		AverageArea obj=new AverageArea();
		obj.area(5d);
		obj.area(5,9);
		obj.area(5);
	}
	
	public static void average(int num1,int num2,int num3)
	{
		int total=num1+num2+num3;
		int avg=total/3;
		System.out.println("Average of three integers numbers = " +avg);
	}
	
	public static float average(float num1,float num2,float num3)
	{
		float total=num1+num2+num3;
		float avg=total/3;
		return avg;		
	}
	
	public void area(double radius)
	{
		double area1=3.14d*radius*radius;
		System.out.println("Area of circle = " +area1);
	}
	
	public void area(int length,int bredth)
	{
		int total=length*bredth;
		System.out.println("Area Of a Rectangle = " +total);
	}
	
	public void area(int side)
	{
		int total=side*side;
		System.out.println("Area of a Square = " +total);
	}

}
