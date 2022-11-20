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
        int i =1;
        while(i<=N)
        {
            for (int j =1; j*j<=i;j++)
            {
                if(j*j==i)
                {
                    System.out.print(i+" ");
                }
            }i++;
        }
    }
}
