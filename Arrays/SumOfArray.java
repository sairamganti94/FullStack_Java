import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        int i=0;
        int sum=0;
        int A[] = new int[100];
        Scanner s = new Scanner(System.in);
        for(i=1;i<100;i++)
        {
           A[i]=s.nextInt();
           sum = sum+A[i];
        }
        
        System.out.print(sum);
    }
}
