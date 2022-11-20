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
        int factors =0;
        
        for (int i =1;i<=N;i++)
        {
            if(i == 0 || i == 1)
             continue;
            
            factors = 1;
            for(int j =2; j<=i/2;++j)
            {
                if(i%j == 0)
                {
                    factors =0;
                    break;
                }
            }
            if(factors == 1)
            {
                System.out.println(i);
            }
        
        }

    }
}
