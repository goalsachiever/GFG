import java.util.Scanner;

public class MaximumDifferenceProblem
{
    static int maxDiffNaiveApproach(int[] arr)
    {
        int res = arr[1]-arr[0];
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length ; j++)
            {
                    res  = Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }

    static int maxDiffBetterApproach(int[] arr)
    {
        int res = arr[1]-arr[0];
        int min = arr[0];
        for (int j = 1; j < arr.length; j++)
        {
            res = Math.max(res,arr[j]-min);
            min = Math.min(min,arr[j]);
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxDiffNaiveApproach(arr));
        System.out.println(maxDiffBetterApproach(arr));

        }
}
