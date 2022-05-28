import java.util.Scanner;

public class MaximumCircularSumSubarray
{
    static int maxSumSubset(int[] arr)
    {
        int res = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            sum = Math.max(sum+arr[i],arr[i]);
            res = Math.max(res,sum);
        }
        return res;
    }

    static int maxCircularSubArray(int[] arr)
    {
        int normalSubArray = maxSumSubset(arr);
        int arrSum =0;
        for (int i = 0; i <arr.length ; i++) {
            arrSum+=arr[i];
            arr[i] =-arr[i];
        }
        int circularSubsum = arrSum - ( - maxSumSubset(arr));
        return Math.max(circularSubsum,normalSubArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(maxCircularSubArray(arr));

    }
}
