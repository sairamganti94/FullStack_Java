import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        long A = s.nextLong();
        int decimal = convertDecToBinary(A);
        System.out.print(decimal);
        
    }
    public static int convertDecToBinary(long num) {
    int d = 0, i = 0;
    long r;
    
    while (num != 0) {
      r = num % 10;
      num /= 10;
      d += r * Math.pow(2, i);
      ++i;
    }
    
    return d;
  }       
    
}
