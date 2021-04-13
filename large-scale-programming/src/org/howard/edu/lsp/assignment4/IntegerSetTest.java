package org.howard.edu.lsp.assignment4;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DisplayName.*;

import org.junit.jupiter.api.Test;

class IntegerSetTest {

	ArrayList<Integer> list1= new ArrayList<>();
    ArrayList<Integer> list2= new ArrayList<>(); 
    IntegerSet set1= new IntegerSet(list1);
    IntegerSet set2= new IntegerSet(list2);
    public TestFunctions()
    { 
    	set2.addItem(0);
    	set2.addItem(2);
    	set2.addItem(5);
    	set2.addItem(6);
    	set2.addItem(9);
    	set2.addItem(8);
    	set2.addItem(7); 	
    }
    
	@Test
	@DisplayName("Tests length of array")
	public void testLength()
	{ 
		assertEquals(7, set2.length());
		assertEquals(2, set2.length());
		assertEquals(3, set1.length());
		assertEquals(0, set1.length());
	}
	
	@Test
	@DisplayName("Tests for Clearing array")
	public void testClear()
	{
		set2.clear(); 
		assertEquals(0, set2.length()); 
		assertEquals(2, set2.length());
		assertEquals(0, set1.length()); 
		assertEquals(2, set1.length()); 
	}  
	 
	@Test
	@DisplayName("Test cases for equals")
	public void testEquals()
	{  
		Assert.assertFalse("Sizes are not equal",set2.equals(set1));
		Assert.assertFalse("Sizes are not equal",set1.equals(set2))
		Assert.assertFalse("Sizes are equal",set1.equals(set1))
	} 
	@Test
	@DisplayName("Test cases for largest element")
	public void testLrgElemt() throws Listemptyexception
	{
		Assert.assertEquals(9, set2.largestelement());
		Assert.assertEquals(2,set2.largestelement());
		Assert.assertEquals(4,set1.largestelement());
	}
	
	@Test
	@DisplayName("Test cases for smallest element")
	public void testSmallestElement() throws Listemptyexception
	{
		Assert.assertEquals(0,set2.smallestelement());
		Assert.assertEquals(4,set2.smallestelement());
		Assert.assertEquals(6,set1.smallestelement());
	}
	@Test
	@DisplayName("Tests cases for isEmpty")
	public void testisEmpty() {
		Assert.assertEquals(0,set1.length());
		Assert.assertEquals(2,set1.length());
		Assert.assertEquals(0,set2.length());
		Assert.assertEquals(4,set2.length());
	}
	
	@Test
	@DisplayName("Test for contains")
	public void testContains() {
		
	}
	
	
	@Test
	@DisplayName("Test for addItem")
	public void testAddItem() {
		
	}
	
	
	@Test
	@DisplayName("Test for removeItem")
	public void testRemoveItem() {
		
	}
	
	@Test
	@DisplayName("Test for union")
	public void testUnion() {
		
	}
	
	@Test
	@DisplayName("Test for difference")
	public void testDifference() {
		
	}
	
	@Test
	@DisplayName("Test for intersection")
	public void testIntersection() {
		
	}
	
	@Test
	@DisplayName("Test for toString")
	public void testToString() {
		
	}
	
	
	

}
