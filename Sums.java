import java.util.Scanner;

/* 
   Sums.java
   Philip Johnson
   10/09/2020
   
   
*/
public class Sums {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a command line argument");
        } else {
            try {
                System.out.println("Value entered is " + args[0]);
                int n = Integer.parseInt(args[0]);
                if (n <= 0) {
                    System.out.println(n + " is out of range.");
                } else {
                    int oddSum = 0, evenSum = 0;
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 0)
                            evenSum += i;
                        else
                            oddSum += i;
                    }
                    System.out.println("The sum of the even numbers up to " + n + " is " + evenSum);
                    System.out.println("The sum of the odd numbers up to " + n + " is " + oddSum);
                }
            } catch (NumberFormatException e) {
                System.out.println(args[0] + " is not an integer.");
            }
        }
    }
}