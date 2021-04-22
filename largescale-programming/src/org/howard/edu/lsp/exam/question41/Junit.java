package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit extends RemoveZeros {
	Integer[] nums = {0, 7, 2, 0, 4, 0};
	
	@Test
	void testremoveZeros() {
		assertNotEquals(0, nums.equals(0));
	}

}
