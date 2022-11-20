public static boolean solve(int arr[]) {
    int N = arr.length;
    for(int i =1;i<=N-2;i++)
    {
        if(arr[i] == arr[i+1])
        {
            return true;
        }
    }
    return false;
    // Complete the function here
}
