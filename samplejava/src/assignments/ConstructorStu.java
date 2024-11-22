package assignments;

public class ConstructorStu 
{
	 String a;
	 int b;
	 int c;
	 int total;
	public static void main(String[] args) 
	{
		ConstructorStu obj=new ConstructorStu("Lilly",50,40);
		ConstructorStu obj1=new ConstructorStu("Jas",8,42);
		int total1=obj.gettotal();
		int total2=obj1.gettotal();
		String grade1=obj.getgrade();
		String grade2=obj1.getgrade();
		System.out.println("Total marks of " +obj.a + " is " +total1+ " & Grade is " +grade1);
		System.out.println("Total marks of " +obj1.a + " is " +total2+ " & Grade is " +grade2);
	}
	
	public ConstructorStu(String student,int mark1,int mark2)
	{
		a=student;
		b=mark1;
		c=mark2;
	}
	
	public int gettotal()
	{
		total=b+c;
		return total;		
	}
	
	public String getgrade()
	{
		if(total>=90)
		{
			return "A";
		}
		else if(total>=80 && total<90)
		{
			return "B";
		}
		else if(total>=70 && total<80)
		{
			return "C";
		}	
	    else if(total>=60 && total<70)
	    {
		return "D";
	    }
	    else
	    {
		return "F";
	    }
		
	}

}
