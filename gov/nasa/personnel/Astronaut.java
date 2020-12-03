// Astronaut.java
// Philip Johnson
// 09/25/2020
// Return float values from integer array

package gov.nasa.personnel;

public class Astronaut {
  
   // data fields
   private String name; // name of astronaut
   private double height; // height of astronaut (in centimeters)
   private double weight; // weight of astronaut (in kilograms)
  
   // constructor
   public Astronaut(String name, double height, double weight) {
       // initialize data fields
       this.name = name;
       this.height = height;
       this.weight = weight;
   }

}