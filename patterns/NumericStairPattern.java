/* Given an integer N as input, print the corresponding pattern for N.

For example if N = 4 then pattern will be like:

1
1 2
1 2 3
1 2 3 4
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
        for(int i =1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(j!=i)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
