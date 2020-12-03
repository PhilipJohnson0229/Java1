import java.util.Scanner;

/* 
   Print.java
   Philip Johnson
   10/25/2020
   
   
*/


interface Function {
    int evaluate(int arg);
}

class Half implements Function {
    @Override public int evaluate(int arg) {
        return arg/2;
    }
}

public class Print extends Half {
   
    public static int[] applyFunction(int... arrIn) {
        int length = arrIn.length;
        int[] arrOut = new int[length];
        // create interface reference       
        Function func = new Half();
        // call evaluate for all elements of arrIn
        for (int i = 0; i < length; i++) {
            arrOut[i] = func.evaluate(arrIn[i]);
        }
        return arrOut;
    }
   
   public static void extractodd(ArrayList<int>a1)
    {
        ArrayList<int> result=new ArrayList<int>();
        for(int i=0;i<a1.size();i++)
        {
            if(i%2==1)
            {
                int d=a1.get(i);
                result.add(d);
                a1.remove(i);
            }
        }
        for(int i=0;i<result.size();i++)
        {
            System.out.println(result.get(i));
        }
    }
    
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]/2+" ");
        }
        System.out.println();

    }}

