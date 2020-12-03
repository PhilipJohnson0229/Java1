// RGB.java
// Philip Johnson
// 09/19/2020
// Return float values from integer array

//Import randum number generator
import java.util.Random;

public class RGB
{
   //Constant for intensity value between 0 and 255
   public static final int MAX_RGB_INT = 255;

   //enum representing RGB colors
   enum colorName{RED, GREEN, BLUE}
   
   //this method takes in an integer array and converts each index value to create a parllel double array
   public double[] returnDoubleFromInt(int[] rgb)
   {
      double[] result = new double[3];
      
      //create double values by converting integer values from array parameter
      //the created floates will associate with the index with the same value
      result[0] = (double)rgb[0]/MAX_RGB_INT;
      result[1] = (double)rgb[1]/MAX_RGB_INT;
      result[2] = (double)rgb[2]/MAX_RGB_INT;
      
      //returns newly ceeated double aray
      return result; 
   }
   
   //this method reads values from both integer and double arrays
   public void returnColorName(int[] rgbInt, double[] rgbDbl)
   {
      System.out.println(colorName.RED + "\t" + rgbInt[0] + "\t" + rgbDbl[0]);

      System.out.println(colorName.GREEN + "\t" + rgbInt[1] + "\t" + rgbDbl[1]);

      System.out.println(colorName.BLUE + "\t" + rgbInt[2] + "\t" + rgbDbl[2]);
   }
   
   public static void main(String[] args)
   {
      //Create RGB object
      RGB rgb = new RGB();
   
      //Create a new random number generator object
      Random r = new Random();
      
      
      int[] rgbInt = new int[3];

      rgbInt[0] = r.nextInt(MAX_RGB_INT + 1);

      rgbInt[1] = r.nextInt(MAX_RGB_INT + 1);

      rgbInt[2] = r.nextInt(MAX_RGB_INT + 1);

     

      //converting to double form

      double[] rgbDouble = rgb.returnDoubleFromInt(rgbInt);

      //displaying colors

      rgb.returnColorName(rgbInt, rgbDouble);
   }
}