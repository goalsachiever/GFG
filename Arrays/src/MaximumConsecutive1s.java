import java.util.Scanner;

public class MaximumConsecutive1s
{
    static int maxConsecutive(int[] arr)
    {
        int count=0;
        int res=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==0)
                count = 0;
            else
            {
                count++;
                res = Math.max(count,res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxConsecutive(arr));
    }
}
