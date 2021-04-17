package org.howard.edu.assignment7.tollbooth;
import java.util.*;

public interface TollBooth {
   public void DisplayData();
   public int calculateToll(Truck T);
   public void reset();
   public Truck[] listTrucks();
}