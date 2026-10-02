package Practice;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4};
		
		int[][] matrix = {{1,2},{1,3},{1,4}};
		
		System.out.println(Arrays.toString(arr));  // Printing array into String
		System.out.println(Arrays.deepToString(matrix));  //Printing 2D Array
		System.out.println(arr);
		
		for(int array: arr)    //Printing array by commas
		{
			if(array<=arr.length-1)
			{
			System.out.print(array + ",");
			}
			else
			{
				System.out.println(array);
			}-[bn7600000000006]
		
		} 
		
		for(int i= arr.length-1;i>=0;i--) // printing arrays in reverse
		{
			System.out.println(arr[i]);
		}
	
		for (int i = 0; i < arr.length - 1; i++) // Printing array elements separated by commas
		{ 
		    System.out.print(arr[i] + ", ");
		}
		
		    System.out.println(arr[arr.length - 1]);
		    
		    
		
	
		
	}
}
