package org.howard.edu.lsp.assignment4;
import java.util.*;
import java.util.Set;



public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>(); 
	public IntegerSet() {
	   }
	
	
  public IntegerSet(List<Integer> set) {
       this.set=set;
   }
  


  // Clears the internal representation of the set
  public void clear() {
      set.clear();
  };
  
  

  // Returns the length of the set
  public int length() {
    return set.size();
  }; // returns the length

  
  /**
   * Returns true if the 2 sets are equal, false otherwise;
   * Two sets are equal if they contain all of the same values in ANY order.
   * takes in a set b and if the two sets are equal then the function will return true
   * @param b
   * @return true if sets are equal, false if they are not.
   */
public boolean equals(IntegerSet b) { 
   if (set==(b.set)){
     return true;
   }

   return false;
}; 


/**
 *  Returns true if the set contains the value, otherwise false
 * @param value
 * @return true if vale is in the set.
 */
  public boolean contains(int value) {
    return set.contains(value);
  };    

  
  /**
   * Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
   * @return max integer in the array
   * @throws IntegerSetException
   */
  public int largest() throws IntegerSetException {
   int max=0;
   try{
      
    for(int i=0;i<set.size();i++) {
      if(set.get(i)>max) {
        max=set.get(i);
      }
    }

    return max;
  }
   catch(Exception e){
     System.out.println("Something went wrong.");
   }

  return max;

  }; 

  /**
   * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
   * @return smallest integer in the set
   * @throws IntegerSetException if the set is empty
   */
  public int smallest() throws IntegerSetException {
    
    int min = set.get(0);

  try{
    
    for(int i=0;i<set.size();i++) {
      if(set.get(i)<min) {
        min=set.get(i);
      }
    }
    return min;
  }
  catch(Exception e){
    System.out.println("Something went wrong.");
  }
  
  return min;
    
  };

	/**
	 * Adds an item to the set or does nothing it already there	
	 * @param item if the item is in the set
	 */
 	public void add(int item) {
    
     for(int i=0; i<set.size(); i++){
       if(set.get(i) == item){
         return;
       }
     }
      set.add(item);
     
   }; // adds item to s or does nothing if it is in set
/**
 * Removes an item from the set or does nothing if not there
 * @param item removes given integer from set. 
 */
public void remove(int item) {
    for(int i=0;i<set.size();i++) {
          
           if(set.get(i)==item) {
               set.remove(i);
           }
       }
}; 


/**
 * Set union
 * @param intSetb takes in an array and adds it to 'set'
 */
public void union(IntegerSet intSetb) { 
	 for(int i=0;i<intSetb.set.size(); i++) {
		 set.add(intSetb.set.get(i));
	 }
	 System.out.println("Union of Set1 & Set2: " + set);
}; 

/**
 * Set intersection
 * @param intSetbif integer in set is also in set B, it will output those numbers.
 */
public void intersect(IntegerSet intSetb) {
	System.out.println("Intesection of Set1 & Set2 : ");
   for(int i = 0; i < set.size(); i++)
   {		
	   
	   if(set.get(i)==intSetb.set.get(i))
	   {
		   System.out.println(set.get(i));
	   }
   }
}; 


/**
 * Set difference, i.e., s1-s2
 * @param intSetb 
 * Removes all values that are the same and outputs the difference of the two sets
 */
public void diff(IntegerSet intSetb){
		System.out.println("Difference of Set1 & Set2 : " + set.removeAll(intSetb.set));
}; // set difference, i.e. s1 - s2

// Returns true if the set is empty, false otherwise
boolean isEmpty(){
  if(set.isEmpty()){
    return true;
  }

  return false;
}; 

// Return String representation of your set
public String toString() {
	String result = "";
	for(int i = 0; i < set.size(); i++)
	{
		result+=set.get(i);
		result+="\n";
	}
  return result;
};	// return String representation of your set
  
}