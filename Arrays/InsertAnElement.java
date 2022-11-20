/*
Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X. X is based on 1-based indexing.

Note: When an element is inserted at position X, all elements that were already present at position >= X, gets shifted to one position right, not replaced.
*/
import java.lang.*;
import java.util.*;

public class Main {
public static void main(String[] args) 
{
// YOUR CODE GOES HERE
// Please take input and print output to standard input/output (stdin/stdout)
// DO NOT USE ARGUMENTS FOR INPUTS
// E.g. 'Scanner' for input & 'System.out' for output

       Scanner sc = new Scanner(System.in);
       int N= sc.nextInt();
       int arraynum[] = new int[N];
       for(int i=0;i<N;i++)
       {

             arraynum[i]=sc.nextInt();
       }
       int posX= sc.nextInt();
       int elementNewY=sc.nextInt();
       int array2[] = new int[N+1];
       for(int i=0;i<N+1;i++)
       {

            if(i<posX-1)
            {
               array2[i]=arraynum[i];
            }
           else if(i==posX-1)
           {
             array2[i] = elementNewY;
           }             
           else
           {
              array2[i]=arraynum[i-1];
           }

      }
      for(int i=0;i<N+1;i++){
        System.out.print(array2[i]+" ");
      }



    }
}

