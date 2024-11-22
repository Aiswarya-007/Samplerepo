package sampleworkout;

public class Aggregationchild 
{

	int age;
	String address;
	Aggregationparent ref;
	public static void main(String[] args) 
	{
		Aggregationparent obj=new Aggregationparent("ram",6);
		Aggregationchild obj1=new Aggregationchild(12,"tvm",obj);
		obj1.display();
	}
	
	public Aggregationchild(int age,String address,Aggregationparent ref)
	{
		this.age=age;
		this.address=address;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println(age + address + ref.name + ref.cls);
	}

}
