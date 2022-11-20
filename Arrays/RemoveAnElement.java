/*Write a program to input N numbers array from user and an integer X and print the array by deleting element at specified position X.

Problem Constraints

1 <= N <= 100

1 <= A[i] <= 1000

1 <= X <= N



Input Format

First line is N which means number of elements.

Second line contains N space separated integers.

Third line is X position which has to be deleted.
*/

import java.lang.*;
import java.util.*;

public class Main {
    public static int[] remove(int[] arr, int index)
    {
        int[] another = new int[arr.length - 1];
        for (int i = 0,k =0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            another[k++] = arr[i];
        }
        return another;
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[]=new int[N];
        for(int i =0;i<N;i++)
        {
            arr[i] =s.nextInt();
        }
        int Y = s.nextInt();
        arr = remove(arr,Y);
        for(int i =0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
    }
}
