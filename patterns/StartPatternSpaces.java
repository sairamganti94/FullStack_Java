/*
Given an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

********** // 0 spaces

****__**** // 2 spaces

***____*** // 4 spaces

**______** // 6 spaces

*________* // 8 spaces

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
        int i,j;
        int N = s.nextInt();
        for(i=1;i<=N;i++)
        {
            //int l= 2i-2;
            for(j=1;j<=N-i+1;j++)
            {
                System.out.print("*");
            }
            for(j=1;j<=(2*i)-2;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=N-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
