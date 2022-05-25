import java.util.Scanner;

public class LeaderInArray
{
    static void leaderNaiveApproach(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i]<=arr[j])
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                System.out.print(arr[i]+" ");
        }
    }

    static void leaderBetterApproach(int[] arr)
    {
        int curr = arr[arr.length-1];
        System.out.print(curr+" ");
        for (int i = arr.length-2; i >=0 ; i--)
        {
            if(curr < arr[i])
            {
                curr = arr[i];
                System.out.print(curr+" ");
            }
        }
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
        leaderNaiveApproach(arr);
        System.out.println();
        leaderBetterApproach(arr);
    }
}
