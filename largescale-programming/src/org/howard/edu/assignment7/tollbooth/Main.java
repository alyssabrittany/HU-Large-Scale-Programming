package org.howard.edu.assignment7.tollbooth;

import java.util.*;

class Main {
   public static void main(String [] args){
       Toll booth = new Toll();
       Truck Ford = new FordTruck(5,12500); // 5 axles and 12000 kilograms
       Truck Nissan = new NissanTruck(2,5000);// 2 axles and 5000kg
       Truck Daewoo = new DaewooTruck(6,17000);// 6 axles and 17000kg






       System.out.println("TRUCK ARRIVAL :");
       booth.calculateToll(Ford);
       booth.DisplayData();
       System.out.println("*************************************************************");
       System.out.println("TRUCK ARRIVAL :");
       booth.calculateToll(Nissan);
       booth.reset();
       System.out.println("*************************************************************");
       booth.listTrucks();
       booth.DisplayData();
       booth.reset();
       System.out.println("TRUCK ARRIVAL :");
       booth.calculateToll(Daewoo);
       booth.listTrucks();
       booth.DisplayData();
   }
}