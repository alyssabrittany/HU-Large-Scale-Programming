package org.howard.edu.lsp.assignment4;
import java.util.*;

/**
 * 
 * @author alyssasullins
 *
 */

public class Driver {

   public static void main(String[] args) throws Listemptyexception {
      
    //IntegerSet list1 = new IntegerSet();
    //IntegerSet list2 = new IntegerSet();
	   ArrayList<Integer> list1= new ArrayList<>();
	   ArrayList<Integer> list2= new ArrayList<>();
	     
	     
	   // make 2 instance of integerset class for implementation
	   IntegerSet set1= new IntegerSet(list1);
	   IntegerSet set2= new IntegerSet(list2);
  
// make 2 instance of integerset class for implementation
// make 2 instance of integerset class for implementation

set1.addItem(1);
set1.addItem(3);
set1.addItem(4);
set1.addItem(6);
set1.addItem(9);
set1.addItem(8);
set1.addItem(7);

set2.addItem(0);
set2.addItem(2);
set2.addItem(5);
set2.addItem(6);
set2.addItem(9);
set2.addItem(8);
set2.addItem(7); 
  
System.out.println("Set1 length : " + set1.length());
System.out.println("Set2 length : " + set2.length());
System.out.println("Set1 equals Set2? : "+ set1.equals(set2));
System.out.println("Set1 contains 2? : " + set1.contains(2));
System.out.println("Set2 contains 2? : " + set2.contains(2));
System.out.println("Largest element in set1 : "+set1.largestelement());
System.out.println("Largest value in Set2 : " + set1.largestelement());
System.out.println("Smallest value in Set1 : " + set1.smallestelement());
System.out.println("Smallest value in Set2 : " + set2.smallestelement());
set1.union(set2);
System.out.println("Set1 to String : " + set1.toString());
System.out.println("Set2 to String : " + set2.toString());  
set1.difference(set2);
System.out.println("Set1 is empty? : " + set1.isEmpty());
System.out.println("Set2 is empty? : " + set2.isEmpty());
set1.removeItem(1);
set2.removeItem(0);
System.out.println("New smallest value in Set1 : " + set1.smallestelement());
System.out.println("New smallest value in Set2 : " + set2.smallestelement());
set1.clear();
set2.clear(); 
   } 
}