import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        
        int T = s.nextInt();
        //System.out.println(T);
        int i =1;
        while(i<=T)
        {
            int digit =0;
            long N = s.nextLong();
            //System.out.println(N);
            if(N == 0)
            {
               System.out.println(1);
                
            }
            else
            {
                 while(N>0)
              {
                
                 N/=10;
                 ++digit;
            
              }
            System.out.println(digit);
            }
            
            i++;
        }
        

    }
}
