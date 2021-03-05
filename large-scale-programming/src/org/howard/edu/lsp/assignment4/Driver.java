package org.howard.edu.lsp.assignment4;

import java.util.*;

/**
 * 
 * @author alyssasullins
 *
 */

public class Driver {

   public static void main(String[] args) throws IntegerSetException {
      
    //IntegerSet list1 = new IntegerSet();
    //IntegerSet list2 = new IntegerSet();
List<Integer> newSet = new ArrayList<Integer>();
List<Integer> newSet1 = new ArrayList<Integer>();
IntegerSet set1= new IntegerSet(newSet);
IntegerSet set2= new IntegerSet(newSet1);
  
// make 2 instance of integerset class for implementation
// make 2 instance of integerset class for implementation

set1.add(1);
set1.add(3);
set1.add(4);
set1.add(6);
set1.add(9);
set1.add(8);
set1.add(7);

set2.add(0);
set2.add(2);
set2.add(5);
set2.add(6);
set2.add(9);
set2.add(8);
set2.add(7); 
  
System.out.println("Set1 length : " + set1.length());
System.out.println("Set2 length : " + set2.length());
System.out.println("Set1 equals Set2? : "+ set1.equals(set2));
System.out.println("Set1 contains 2? : " + set1.contains(2));
System.out.println("Set2 contains 2? : " + set2.contains(2));
System.out.println("Largest value in Set1 : " + set1.largest());
System.out.println("Largest value in Set2 : " + set1.largest());
System.out.println("Smallest value in Set1 : " + set1.smallest());
System.out.println("Smallest value in Set2 : " + set2.smallest());
set1.union(set2);
System.out.println("Set1 to String : " + set1.toString());
System.out.println("Set2 to String : " + set2.toString());  
set1.diff(set2);
System.out.println("Set1 is empty? : " + set1.isEmpty());
System.out.println("Set2 is empty? : " + set2.isEmpty());
set1.remove(1);
set2.remove(0);
System.out.println("New smallest value in Set1 : " + set1.smallest());
System.out.println("New smallest value in Set2 : " + set2.smallest());
set1.clear();
set2.clear();



   }

}