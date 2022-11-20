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
        int i =1;
        while(i<=T)
        {
            int N = s.nextInt();
            int sum =0;int R;
            while(N>0)
            {
                R = N%10;
                sum = sum+R;
                N = N/10;
            }
            System.out.println(sum);
            i++;
        }
        
    }
}
