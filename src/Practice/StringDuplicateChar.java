package Practice;

public class StringDuplicateChar {

	
	public static void main(String[] args)
	{
		String s= "MADAMA";
		int count=0;
		 char[] ch= s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if( ch[i]==ch[j])
						{
					System.out.println("Duplicate Characaters are "+ ch[j]);
					count++;
						}
			}
			
		}
		System.out.println("Number of Duplicate Characaters are "+ count);
	}
}
