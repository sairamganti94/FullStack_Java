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
        int last = 0;
        int first = 0;
        int i =1;
           while(i<=T)
           {
               int N = s.nextInt();
               /*
               if(N!=0)
               {
                last = N%10;
                break;
               }
               while(N>=10)
               {
                  first/= 10;
                  
               }
              */
               
               first = N;
               while(first>=10)
               {
                   first = first/10;
               }
               last = N%10;
               System.out.println(first +" "+last);
               i++;  
               
           }
          // System.out.println(first +" "+last);
        
    }
}
