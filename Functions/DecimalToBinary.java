public class Solution {
    public static long solve(int A) {
        long binary =0;
        int reminder =1; int i=1;
        while(A!=0)
        {
            reminder = A%2;
            A /= 2;
            binary += reminder*i;
            i*=10;
            
        }
        return binary;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        long binary = solve(num);
        System.out.print(binary);
    }
}
