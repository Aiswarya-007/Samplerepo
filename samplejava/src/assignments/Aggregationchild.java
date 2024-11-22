package assignments;

public class Aggregationchild 
{
	String name;
	int roll;
	Aggregationparent ref;
	
	public static void main(String[] args) 
	{	
		Aggregationparent obj=new Aggregationparent("trv");
		Aggregationchild obj1=new Aggregationchild("sita",11,obj);
		obj1.display();
	}
	
	
	public Aggregationchild(String name,int roll,Aggregationparent ref)
	{
		this.name=name;
		this.roll=roll;
		this.ref=ref;	
	}	
	
	public void display()
	{
		System.out.println("Student name: " +name);
		System.out.println("Roll no: " +roll);
		System.out.println("Address: " +ref.add);
	}

}
