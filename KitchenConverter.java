// KitchenConverter.java
// Philip Johnson
// 09/13/20
// Converts cups to tablespoons

public class KitchenConverter 
{
    public static void main(String[] args) {
        int TBSP_PER_CUP = 16;
        double cups = 5.5; // test data allow fractional values
        double tbsp = 0.0;

        tbsp = cups * TBSP_PER_CUP; // convert
        System.out.printf("%.2f cups is %.2f tablespoons\n", cups, tbsp);
        }
}
