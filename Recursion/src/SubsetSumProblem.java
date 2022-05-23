import java.util.Scanner;

public class SubsetSumProblem
{
    static int subsetSum(int[] arr ,int n , int sum)
    {
        if(n==0)
        {
            return (sum==0) ? 1 : 0 ;
        }
        return subsetSum(arr,n-1,sum)+subsetSum(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] =sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(subsetSum(arr, arr.length,sum));
    }
}
