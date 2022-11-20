import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        //int i, j;
        int N = s.nextInt();
        int i,j;
        for(i=N;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.print(j);
                }
                else
                { 
                    System.out.print(j);
                 
                    System.out.print(" ");
                }
                //System.out.print(j)        
            }
            System.out.println();
        }
    }
}
