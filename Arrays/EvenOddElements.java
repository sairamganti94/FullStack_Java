public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int T =s.nextInt();
        for(int j=1;j<=T;j++)
        {
            int even=0; int odd =0;
            int N = s.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++)
            {
                arr[i]=s.nextInt();
            
            }
            for(int i=0; i<N;i++)
            {
                if(arr[i]%2 != 0)
                {
                    System.out.print(arr[i]+" ");
                }

            }
            System.out.println();
            for(int i=0;i<N;i++)
            {
                if(arr[i]%2 == 0)
                {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
               
        }
    }
}
