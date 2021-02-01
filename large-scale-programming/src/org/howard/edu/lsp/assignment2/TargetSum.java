package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;

/**
 * 
 * @author alyssa sullins
 * 			@02894355
 * 
 */

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * The Check Combination will call an instance of the implementation class,
		 * then a variable m is assigned to the method which will have an array of numbers
		 * inserted, and a target sum and output indexes of different combinations
		 * which add up to the target sum.
		 * 
		 * 
		 * @param m is the name of the variable assigned to Check Combinations, which will input an array and target sum.
		 * @param a hard coded array of integers {1, 2, 3, 4, 5, 6} 
		 * @pram a hard coded target sum is 6 
		 * @return will output different combinations that add up to the target sum.
		 */
		Implementation CheckComationation = new Implementation();
		ArrayList<Integer> m =(CheckComationation.calculate_combinations(new int[] {1, 2, 3, 4, 5, 6}, 6));

	}

}
/**
 * Hard coded input:
 * VALUES: 1, 2, 3, 4, 5, 6
 * TARGET SUM: 6
 * 
OUTPUT:
[5]
[0,4]
[1,3]
[2,2]
[3,1]
[0,1,2]
[0,2,1]
[1,1,1]
 */
