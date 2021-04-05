package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junit {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest  { 

	ArrayList<Integer> list1= new ArrayList<>();
    ArrayList<Integer> list2= new ArrayList<>(); 
    IntegerSet set1= new IntegerSet(list1);
    IntegerSet set2= new IntegerSet(list2);
    public IntegerSetTest()
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
	@DisplayName("Tests length of arry")
	public void testLength()
	{ 
		assertEquals(7, set2.length());
	}
	
	@Test
	@DisplayName("Tests for Clearing array")
	public void testClear()
	{
		set2.clear(); 
		assertEquals(0, set2.length()); 
	}  
	 
	@Test
	@DisplayName("Test cases for equals")
	public void testEquals()
	{  
		Assert.assertFalse("Sizes are not equal",set2.equals(set1));
	}  
	@Test
	@DisplayName("Tests cases for isEmpty")
	public void testisEmpty() {
		Assert.assertEquals(0,set1.length());
	}
	
	@Test
	@DisplayName("Tests cases for largest")
	public void testisLargest() throws Listemptyexception {
		Assert.assertEquals(9,set2.largestelement());
	}
	
	@Test
	@DisplayName("Tests cases for smallestelement")
	public void testissmallestelement() throws Listemptyexception {
		Assert.assertEquals(0,set2.smallestelement());
	}
	
	@Test
	@DisplayName("Tests cases for union")
	public void testiUnion() {
		IntegerSet set3 = set1.union(set2);  
		Assert.assertEquals(7,set3.length());
	}
	//intersection
	@Test
	@DisplayName("Tests cases for Intersection")
	public void testiIntersection() {
		IntegerSet set3 = set1.intersection(set2); 
		Assert.assertNotEquals(0,set3); 
	}
	@Test
	@DisplayName("Tests cases for difference")
	public void testDifference() {
		IntegerSet set3 = set1.difference(set2); 
		Assert.assertNotNull(set3); 
	} //toString
	@Test
	@DisplayName("Tests cases for toString")
	public void testtoString() {
		String result = set2.toString(); 
		Assert.assertNotEquals("", result); 
	}//contains
	@Test
	@DisplayName("Tests cases for Contains")
	public void testContains() {
		boolean result = set2.contains(0); 
		Assert.assertNotEquals(false, result); 
	}
	@Test
	@DisplayName("Tests cases for addItem")
	public void testaddItem() {
		set2.addItem(55);
		Assert.assertNotEquals(false, set2.contains(55)); 
	}
	
	@Test
	@DisplayName("Tests cases for addItem")
	public void testremoveItem() {
		set2.addItem(105);
		set2.removeItem(105);
		Assert.assertNotEquals(true, set2.contains(105)); 
	}
}
