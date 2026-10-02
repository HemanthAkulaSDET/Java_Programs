package Practice;

//String Reverse without using functions
/*public class StringReverse {
	public static void main(String[] args) {
	
	String s= "Hemanth";
	String str ="";
	for(int i=s.length()-1;i>=0;i--)
	{
		 str=str+s.charAt(i);
	}
	System.out.println("The reversed string is :" + str);
	
	}
}*/
//String using StringBuilder reverse method
/*public class StringReverse{
	 
	 public static void main(String[]args)
	 {
		 String s="Hemanth";
		 String reversed= new StringBuilder(s).reverse().toString();
		 System.out.println("The reversed string is :" + reversed);
		 
	 }
 }*/

//String Reverse using toCharArray()

public class StringReverse{
	 
	 public static void main(String[]args)
	 {
		 String s = "Hemanth";
		 char[] ch=s.toCharArray();
		 String reversed="";
		 for(int i=ch.length-1;i>=0;i--)
		 {
			 reversed = reversed+ch[i];
		 }
		 System.out.println("The reverses String is :"+ reversed);
	 }
	 
}
