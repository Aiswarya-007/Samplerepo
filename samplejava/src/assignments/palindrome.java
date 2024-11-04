package assignments;

public class palindrome 
{
	static String rev="";
	static String s;
	public static void main(String[] args)
	{
		palindrome.reverse(10501);
		palindrome.check();
	    
	}
	
	public static void reverse(int a)
	{
		int i;
	    System.out.println("The number you have entered is " +a);
	    s=String.valueOf(a);
	   // System.out.println(s);	    	    
	    for(i=0;i<s.length();i++)
	    {
	       	rev=s.charAt(i)+rev;	       	
	    
	    }
	}
	    
	    public static void check()
	    {
	    	if(s.equals(rev))
	       	{
	       		System.out.println("The Given number/string is Palindrome " +rev);
	       	}
	       	else
	       	{
	       		System.out.println("The Given number/string is not Palindrome");
	       	}
	    }

	

}
