package Practice;

public class StringFunctions {

	static String s= "Hemanth";
	public static void main(String[]args)
	{
		s=s.concat(" Akula");
		System.out.println("The Concatinated String is "+s);
	    char t= s.charAt(3);
	    System.out.println("The Character at index 3 is "+t);
	    int u = s.length();
	    System.out.println("The Length of the String is "+u);
		String v= s.substring(8);
		System.out.println("The Substring of the String is "+v);
	}
	
}
