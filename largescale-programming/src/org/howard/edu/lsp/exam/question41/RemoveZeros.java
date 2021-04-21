package org.howard.edu.lsp.exam.question41;

import java.util.*;

public class RemoveZeros {

   public static void main(String[] args) {
   Integer[] nums = {0, 7, 2, 0, 4, 0};
   ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(nums));
   
   System.out.println("Original list : " + "0, 7, 2, 0, 0, 4, 0");
   removeZeros(list);
   System.out.println("List without zeroes : " + list);
} 
   
   
public static void removeZeros(ArrayList<Integer> list) {
   for (int i = 0; i < list.size(); i++) {
       if (list.get(i) == 0) {
           list.remove(i);
       }
     }
   }
 }