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
            int sum =0;
            int j=1;
            int A = s.nextInt();
              while(j <= A/2)
            {
                      if(A%j == 0)
                     {
                        sum = sum+j;
                     }
                     j++;
            }
                if(sum == A)
               {
                 System.out.println("YES");
               }
               else
               {
                 System.out.println("NO");
               }
            
            i++;
        }
    }
}
