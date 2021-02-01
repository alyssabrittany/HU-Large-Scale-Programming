package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;

/**
 * 
 * @author alyssa sullins
 * 			@02894355
 */

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
