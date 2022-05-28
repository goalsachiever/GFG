import java.util.Scanner;

public class MaxSumKthConsecutiveElement
{
    // naive approach O(n-k)*O(k)
    static int maxKSum(int[] arr,int k)
    {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-k+1; i++)
        {
            int sum =0;
            for (int j = 0; j < k; j++)
                sum+=arr[j];
            max = Math.max(max,sum);
        }
        return max;
    }


    //Window sliding technique
    static int maxSumEfficientApproach(int[] arr, int k)
    {
        int curr_sum = 0;
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            curr_sum+=arr[i];
        }
        max_sum = curr_sum;
        for (int i = k; i < arr.length; i++)
        {
            curr_sum +=arr[i]-arr[i-k];
            max_sum=Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }

    }
}
