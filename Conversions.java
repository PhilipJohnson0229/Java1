import java.util.Scanner;

//Sums.java
public class Sums {

   public static void main(String[] args) {
       //variables to hold evens and odd sums
       int sumOfOdds=0;
       int sumOfEvens=0;
       try {
           //parse the command line argument
           int number = Integer.parseInt(args[0]);
           System.out.println("Value entered is "+number);
           if(number > 0) {
               //for loop to calculate
               for(int i=1;i<=number;i++) {
                   if(i%2 ==0)
                       sumOfEvens=sumOfEvens+i;
                   else
                       sumOfOdds=sumOfOdds+i;
               }
               //print the sums
               System.out.println("The sum of the even numbers up to " + number + " is " + sumOfEvens);
               System.out.println("The sum of the odd numbers up to " + number + " is " + sumOfOdds);

           }else {
               System.out.println(number + " is out of range.");  
           }
           // catch exception
       }catch(NumberFormatException nfe) {
           System.out.println(args[0] + " is not an integer.");
       }
   }
}

