/*
  You are given a Bank account having N amount and you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.

After the operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.

*/



public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Type = s.nextInt();
        int X = s.nextInt();
        
        if(Type == 1)
        {
            System.out.print(N+X);
        }
        else if(Type == 2 && (N > X))
            {
                
                System.out.print(N-X);
                
            }
        else 
        {
            System.out.print("Insufficient Funds");
        } 
    }
}
