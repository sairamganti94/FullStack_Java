import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         Scanner s = new Scanner(System.in);
         int N = s.nextInt();
         int factors = 0;
         for (int i=1; i<=N;i++)
         {
             if(N%i == 0)
           {
               factors++;
           }
       
        }
        System.out.print(factors);
  
 }
}
