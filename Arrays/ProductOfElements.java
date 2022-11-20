/*Write a program that returns the product of all elements present in the list.*/

public static long solve(int[] arr) 
{
       // Scanner s = new Scanner(System.in);
        int n = arr.length;
        long prod = 1;
        for(int i =0;i<n;i++)
        {
            //arr[i] = s.nextInt();
            prod = prod*arr[i];
        }
         // Complete the function template 
        return prod;
}
