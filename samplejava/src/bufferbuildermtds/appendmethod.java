package bufferbuildermtds;

public class appendmethod {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello, How are");
		sb.append(" you?");
		System.out.println(sb);
		appendmethod.display();
	}
	
	public static void display()
	{
		StringBuilder sb=new StringBuilder("hey");
		sb.append(" Beautiful");
		System.out.println(sb);
	}
	

}
