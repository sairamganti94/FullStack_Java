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
        int B = s.nextInt();
        if(A>B)
        {
            for(int i =A;i<=A*A;i++)
            {
                if(i%A == 0 && i%B == 0)
                {
                    System.out.print(i);
                    break;
                }
            }
        }
        else{
            for(int i = B;i<=B*B;i++)
            {
                if(i%A == 0 && i%B == 0)
                {
                    System.out.print(i);
                    break;
                }
            }
        }
        
    }
}
