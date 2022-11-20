import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        //Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        long power =1;
        while(B != 0)
        {
            power = power*A;
            --B;
            
        }
        System.out.print(power);
    }
}
