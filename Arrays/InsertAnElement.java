/*
Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X. X is based on 1-based indexing.

Note: When an element is inserted at position X, all elements that were already present at position >= X, gets shifted to one position right, not replaced.
*/
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N,position,Y;
        N = sc.nextInt();
        int a[] = new int[N+1];
        for(int i =0;i<N;i++)
        {
            a[i] = sc.nextInt();
        }
        position = sc.nextInt();
        Y = sc.nextInt();
        for(int i = N-1;i>=position-1;i--)
        {
            a[i+1]=a[i];
        }
        a[position-1]=Y;
        for(int i =0;i<N;i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.print(a[N]+" ");
    }
}
