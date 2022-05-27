import java.util.Scanner;

public class LongestEvenOddSubarray
{
    static int lengthEvenOddLongest(int[] arr)
    {
        int res = 1,curr = 1;
        for (int i = 1; i < arr.length ; i++) {
            if( (arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i-1]%2==0 && arr[i]%2!=0) )
            {
                curr++;
                res = Math.max(curr,res);
            }
            else
                curr = 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(lengthEvenOddLongest(arr));

    }
}
