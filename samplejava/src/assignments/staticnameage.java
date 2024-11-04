package assignments;

public class staticnameage {
	
	static String name;
	static int age;
	
	public static void main(String args[]) 
	{
		staticnameage.setnameage();
		staticnameage.getnameage();
	}
	
	public static void setnameage()
	{
		name="Aiswarya";
		age=10;
	}
	
	public static void getnameage()
	{
		System.out.println(name);
		System.out.println(age);
	}

}
