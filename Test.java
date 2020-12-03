// Test.java
// Philip Johnson
// Unit Test for Pairs.Java

//peanutbutter class
class PeanutButter {
   @Override
   public String toString() {
       return "Peanut Butter";
   }
}
//jelly class
class Jelly {
   @Override
   public String toString() {
       return "Jelly";
   }
}
//mustard class
class Mustard {
   @Override
   public String toString() {
       return "Mustard";
   }
}

public class Test {

   public static void main(String[] args) {

       // Create objects for those small constituent classes
       PeanutButter peanutButter = new PeanutButter();
       Jelly jelly = new Jelly();
       Mustard mustard = new Mustard();
       // Create a pair
       Pair pair = new Pair(peanutButter, peanutButter);
       // Create an array of Pair objects
       Pair[] array = new Pair[] 
       {
         new Pair(peanutButter, jelly),
         new Pair(peanutButter, mustard),
         pair,
         new Pair(peanutButter, peanutButter),
         new Pair(jelly, peanutButter),
         new Pair(jelly, jelly),
         pair,
         pair,
         new Pair(jelly, mustard),
         new Pair(jelly, mustard),
         new Pair(new PeanutButter(), new Mustard()),
         new Pair(new PeanutButter(), mustard)
       };
       // Test toString() and hashCode() methods
       for (int i = 0; i < array.length; i++) {
           System.out.println("pair " + i + ": " + array[i]);
           System.out.println("pair " + i + " hashcode: " + array[i].hashCode());
       }

       // Test equals() method
       for (int i = 1; i < array.length; i++) {
           System.out.println(array[i-1] + " equals " + array[i] + "? " + array[i-1].equals(array[i]));
       }

   }

}