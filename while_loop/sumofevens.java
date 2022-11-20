import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int A = s.nextInt();
        int i = 2;
        while(i <= A)
       {
       
       
           sum = sum+i;
           i = i+2;
       
       
       }  
       System.out.print(sum);

        
    }
}
