import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int rev = A;
        int sum =0;
        int r;
        while(A>0)
        {
            r = A%10;
            sum = (sum*10)+r;
            A = A/10;
            
        }
        if(rev==sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
