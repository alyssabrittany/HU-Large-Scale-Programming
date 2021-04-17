package org.howard.edu.assignment7.tollbooth;

public class FordTruck implements Truck {
	   public FordTruck(int axles, int weight){
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