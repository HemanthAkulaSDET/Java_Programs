package Practice;

public class Palindrome {
	
	 static String str="madam";
	static String rev = new StringBuilder(str).reverse().toString();
	
	public static void main(String[] args)
	{
	
		if(str.equals(rev))
		{
			System.out.println("Given Word "+ str +" is a Palindrome");
		}
		else
		{
			System.out.println("Given word "+ str +" is not a palindrome");
		}
		/*
		int[] arr = {10, 50, 20, 80, 30};
		int max = arr[0];

		for (int n : arr) {
		    if (n > max) max = n;
		}
		System.out.println("Max: " + max);
		
		int n = 10, a = 0, b = 1;
		System.out.print(a + " " + b);

		for (int i =0 ; i < n; i++) {
		    int c = a + b;
		    System.out.print(" " + c);
		    a = b;
		    b = c;
		}
		String sentence = "Automation is fun";
		for (String word : sentence.split(" ")) {
		    StringBuilder sb = new StringBuilder(word);
		    System.out.print(sb.reverse() + " ");
		}
		int n = 10, a = 1;
		System.out.print(a + " ");

		for (int i =0 ; i < n; i++) {
		    a+=2;
		    System.out.print(" " + a);
		    
		}
*/

	}

}
