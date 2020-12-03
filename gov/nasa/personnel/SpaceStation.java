// SpaceStation.java
// Philip Johnson
// 09/25/2020
// Return float values from integer array

package gov.nasa.personnel;

public class SpaceStation {

   // data fields
   private String name; // name of the space station
   private double weight; // weight of the space station (in kilograms)
   private double altitude; // current altitude of the space station (in kilometers)
   // the space station can support up to 10 astronauts
   private static final int MAXIMUM = 10;
   private Astronaut[] astronauts; // array of astronauts in the space station
   private int astronaut_count; // total number of astronauts currently on board
  
   // constructor
   public SpaceStation(String name, double weight) {
       // initialize data fields
       this.name = name;
       this.weight = weight;
       // initialize the altitude and number of astronauts to 0
       this.altitude = 0;
       this.astronaut_count = 0;
       // initialize array
       this.astronauts = new Astronaut[MAXIMUM];
   }
  
   // Adds an astronaut to the space station
   public void addAstronaut(String name, double height, double weight) {
       // create a new astronaut object and add it to array
       astronauts[astronaut_count] = new Astronaut(name, height, weight);
       // increments the count of astronauts
       astronaut_count++;
       // add the astronaut's weight to the total weight of the space station
       this.weight += weight;
   }
  
   // sets current altitude of the space station
   public void setAltitude(double altitude) {
       this.altitude = altitude;
   }
  
   // returns a String with the concatenated values of the space station's
   // name, weight, current altitude, and current number of astronauts
   public String toString() {
       // create a string to return
       String str = "SpaceStation: " + name;
       str = str + "\nWeight (kg): " + String.format("%.2f", weight);
       str = str + "\nAltitude (km): " + String.format("%.2f", altitude);
       str = str + "\nAstronauts: " + Integer.toString(astronaut_count);
       return str;
   }
  
   // main method to run program
   public static void main(String[] args) {
       // instantiate a space station object
       SpaceStation ss = new SpaceStation("ISS", 419700.0);
       // print the state of the new space station object
       System.out.println(ss);
       // add 3 randomly named astronauts to the space station
       ss.addAstronaut("Smith", 167.64, 81.65);
       ss.addAstronaut("Bob", 162.58, 77.34);
       ss.addAstronaut("Mikal", 165.42, 80.52);
       // set the current altitude of the space station object
       ss.setAltitude(400.0);
       // print the state of the space station object again
       System.out.println(ss);
   }
  
}