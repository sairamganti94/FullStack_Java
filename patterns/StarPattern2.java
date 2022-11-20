/* Write a program to input an integer N from user and print hollow inverted right triangle star pattern of N lines using '*'.

See example for clarifications.

*/

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
        int i,j;
        for(i=N;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                if((i == j)||(i == N)||(j == 1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
    }
}
