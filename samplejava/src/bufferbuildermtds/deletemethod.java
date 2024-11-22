package bufferbuildermtds;

public class deletemethod 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("This is a Sample Program");
		sb.delete(10, 16);
		System.out.println(sb);
		deletemethod.display();
	}
	
	public static void display()
	{
		StringBuilder sb=new StringBuilder("This is a trial Version Program");
		sb.delete(16, 23);
		System.out.println(sb);
	}
	
	

}
