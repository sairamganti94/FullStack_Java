/*
Given an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*****
_****
__***
___**
____*
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
		for(i=1;i<=N;i++)
		{
			for(j=1;j<=N;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
        
    }
}
