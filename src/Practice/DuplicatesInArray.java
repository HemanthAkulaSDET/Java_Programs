package Practice;

import java.util.HashSet;

public class DuplicatesInArray {
	
	public static void main(String[]args)
	{
		int[] arr= {1,2,1,2,3,4,5,2,1};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
						{
					       
					        System.out.println("The Duplicates of the String are:" + arr[j]);
					        count++;
						}
			}
		}
		System.out.println("The number ofDuplicates of the String are:" + count);
			}
}

/*public class DuplicatesInArray{
	public static void Dup(int[]arr)
	{
		HashSet<Integer> hs = new HashSet<>();
		for(int num:arr)
		{
			if(!hs.add(num))
			{
				System.out.println("Duplicate found :" + num);
			}
		}
	}
	public static void main(String[]args)
	{
		int[] numbers = {1,2,3,1,2,4,5};
		Dup(numbers);
	}
	
	
}*/