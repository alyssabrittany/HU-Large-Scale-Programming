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
		
		System.out.println("Input: 1, 2, 3, 4, 5, 6");
		System.out.println("Target Sum: 6");
		System.out.println("Sum combinations:");
		
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
		
		/*
		 * TEST ONE
		 */
		ArrayList<Integer> m =(CheckComationation.calculate_combinations(new int[] {1, 2, 3, 4, 5, 6}, 6));
		System.out.println("");
		
		/*
		 * TEST TWO
		 */
		System.out.println("Input: 4, 5, 3, 2, 2");
		System.out.println("Target Sum: 4");
		System.out.println("Sum combinations:");
		ArrayList<Integer> n =(CheckComationation.calculate_combinations(new int[] {4, 5, 3, 2, 2}, 4));
		
		/*
		 * TEST THREE
		 */
		System.out.println("");
		System.out.println("Input: 1, 1, 5, 3, 4");
		System.out.println("Target Sum: 2");
		System.out.println("Sum combinations:");
		ArrayList<Integer> o =(CheckComationation.calculate_combinations(new int[] {1, 1, 5, 3, 4}, 2));
		
		/*
		 * TEST FOUR
		 */
		System.out.println("");
		System.out.println("Input: 8, 5, 6, 4, 3, 1 ");
		System.out.println("Target Sum: 5");
		System.out.println("Sum combinations:");
		ArrayList<Integer> q =(CheckComationation.calculate_combinations(new int[] {8, 5, 6, 4, 3, 1}, 5));
		
		/*
		 * TEST FIVE
		 */
		System.out.println("");
		System.out.println("Input: 1, 1, 3, 2,4 ");
		System.out.println("Target Sum: 0");
		System.out.println("Sum combinations:");
		ArrayList<Integer> p =(CheckComationation.calculate_combinations(new int[] {1, 1, 3, 2,4}, 0));
		
	}

}
/*
 * OUTPUT:
 * 
 * Input: 1, 2, 3, 4, 5, 6
Target Sum: 6
Sum combinations:
[5]
[0,4]
[1,3]
[2,2]
[3,1]
[0,1,2]
[0,2,1]
[1,1,1]

Input: 4, 5, 3, 2, 2
Target Sum: 4
Sum combinations:
[0]
[3,4]
[3,3]
[4,4]
[4,3]

Input: 1, 1, 5, 3, 4
Target Sum: 2
Sum combinations:
[0,1]
[1,1]

Input: 8, 5, 6, 4, 3, 1 
Target Sum: 5
Sum combinations:
[1]
[3,5]
[5,3]
[4,5,5]
[5,4,5]
[5,5,4]

Input: 1, 1, 3, 2,4 
Target Sum: 0
Sum combinations:
NONE
 */
