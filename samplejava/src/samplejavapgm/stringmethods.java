package samplejavapgm;

public class stringmethods 
{
		
	static String s1="Hello World";
	static String s2="this is a sample program";
	
	public static void main(String[] args) 
	{		
		String s3=s2.toUpperCase();
		System.out.println(s3);
		stringmethods.display();
	}
	
	public static void display()
	{
		String s4=s1.toLowerCase();
		String s5="   welcome   ";
		System.out.println(s4);
		System.out.println(s2.startsWith("th"));
		System.out.println(s4.endsWith("d"));
		System.out.println(s1.charAt(0));
		System.out.println(s4.length());
		System.out.println(s2.replace("sample", "trial"));
		System.out.println(s5.trim());
		System.out.println(s1.indexOf("r"));
		System.out.println(s1.isEmpty());
		System.out.println(s2.contains("is"));
		System.out.println(s1.concat(s4));
		System.out.println(s1.compareTo("Hello World"));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.valueOf(3.14f));
	}

}
