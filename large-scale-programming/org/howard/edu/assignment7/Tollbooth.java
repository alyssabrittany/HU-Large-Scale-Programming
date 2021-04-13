package org.howard.edu.assignment7.tollbooth;
import java.util.*;


class Main {
   public static void main(String [] args){
       Toll booth = new Toll();
       Truck1 Ford = new Truck1(5,12500);
       Truck1 Nissan = new Truck1(2,5000);
       Truck1 Daewoo = new Truck1(6,17000);
       System.out.println("TRUCK ARRIVAL :");
       booth.calculateToll(Ford);
       //booth.DisplayData();
       //System.out.println("*************************************************************");
       System.out.println("TRUCK ARRIVAL :");
       booth.calculateToll(Nissan);
       //System.out.println("*************************************************************");
       booth.listTrucks();
       booth.DisplayData();
       booth.reset();
       System.out.println("TRUCK ARRIVAL :");
       booth.calculateToll(Daewoo);
       booth.listTrucks();
       booth.DisplayData();
   }
}


