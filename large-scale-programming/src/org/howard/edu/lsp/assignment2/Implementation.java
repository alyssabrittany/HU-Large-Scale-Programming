package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;

public class Implementation {
    ArrayList<Integer>total_combinations = new ArrayList<Integer>();
	public ArrayList<Integer> calculate_combinations(int[] param, int target_Sum)
	{ 
		/**
		 * Will output index of array, if the target sum is found at one index
		 */
		for(int j = 0; j < param.length; j++)
		{
			if(param[j]==target_Sum)
			{
				total_combinations.add(j);
				System.out.println("["+j+"]");
			}
		}
		
		/**
		 * Will output the indexes of the array, if the target sum is found between two indexes. 
		 * "i" starts from the from of the array
		 * "j" starts from the back of the array
		 * Will add target values to a vector & output 
		 */
		for(int i = 0; i < param.length; i++)
		{
			for(int j = param.length-1; j != 0; j--)
			{
				if(param[i]+param[j]==target_Sum)
				{
					total_combinations.add(j);
					total_combinations.add(i);
					System.out.println("["+i+","+j+"]");
				} 
			}
		} 
		
		/**
		 * Will output the indexes of the array if the target sum is found within 3 indexes of the array
		 */
		for(int i = 0; i < param.length; i++)
		{
			for(int j = param.length-1; j != 0; j--)
			{
				for(int x = 1; x < param.length; x++)
				{
					if(param[i]+param[j]+param[x]==target_Sum)
					{
						total_combinations.add(j);
						total_combinations.add(i);
						System.out.println("["+i+","+x+","+j+"]");
					}
				}
			}
		}
		return total_combinations;
	} 
}
/*total_combinations = calculate_combinations(input=[5, 5, 15, 10], target_sum=15)
ANSWER 1: 
==============
should return 3 sets, as there are 3 combinations of numbers from the input array that add up to 15, namely:
[2]           => input[2] = 15
[0, 3]       => input[0] = 5, input[3] = 10, sum = 15
[1, 3]       => input[1] = 5, input[3] = 10, sum = 15
*/

/*total_combinations = calculate_combinations(input=[1, 2, 3, 4, 5, 6], target_sum=6)
should return 2 sets, as there are 2 combinations of numbers from the input array that add up to 6, namely:
[0, 1, 2]
[1, 3]
[5]
*/