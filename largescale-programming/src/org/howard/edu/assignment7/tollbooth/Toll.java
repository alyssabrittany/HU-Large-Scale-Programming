package org.howard.edu.assignment7.tollbooth;

import java.util.*;

class Toll implements TollBooth {
   Toll(){
       list=new Truck[2000];
       truckcount = 0;
   }
  
   public void calculateToll(Truck T){
     System.out.println("*******Receipt************");
       list[truckcount]=T;
       int axles = T.getAxles();
       int Weight = T.getWeight();
       int tollDue = 5*axles + 10*(Weight/1000);
       System.out.println("Axles: "+ axles);
       System.out.println("Truck's weight: "+ Weight + "kg" );
       truckcount = truckcount + 1;
       System.out.print("Amount due For truck "+ truckcount + " : ");
       System.out.println("$" + tollDue);
   }
  
   public void listTrucks(){
  
       System.out.println("Number of Trucks passed since last reset: "+truckcount);
       for(int i=0;i<truckcount;i++){
           System.out.println("Truck's info: "+(i+1)+" : ");
           Truck T=list[i];
           int axles = T.getAxles();
           int Weight = T.getWeight();
           //int tollDue = 5*axles + 10*(Weight/1000);
           System.out.println("Axles: "+ axles);
           System.out.println("Truck's weight: "+ Weight + "kg" );
       }
   }

   public void DisplayData(){
       System.out.println("Total numbers of Trucks to pass this Toll: " + truckcount);
       int total=0;
       for(int i=0;i<truckcount;i++){
           Truck T=list[i];
           int axles = T.getAxles();
           int Weight = T.getWeight();
           int tollDue = 5*axles + 10*(Weight/1000);
           total+=tollDue;
       }

       
   }

   public void reset(){
       System.out.println("--------TOLLBOOTH RESET--------");
       truckcount=0;
   }

   int truckcount;
   Truck list[];
}

