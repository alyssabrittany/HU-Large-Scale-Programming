package org.howard.edu.assignment7.tollbooth;



class DaewooTruck implements Truck {
   DaewooTruck(int axles, int weight){
       this.axles = axles;
       this.weight = weight;
   }
   public int getAxles(){
       return axles;
   }
   public int getWeight(){
       return weight;
   }
   int axles;
   int weight;
}