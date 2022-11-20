//Question : Given 3 user inputs and print max of three elements

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        if (( A > B) && (A > C))
        {
            System.out.print(A);
        }
        else if(B > C)
        {
            System.out.print(B);
        }  
        else
        {
            System.out.print(C);
        }     
    }
}
