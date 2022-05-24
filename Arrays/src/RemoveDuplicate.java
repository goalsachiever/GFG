import java.util.Scanner;

public class RemoveDuplicate
{
    static int removeDuplicate(int [] arr)
    {
        int res =1;
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i]!=arr[res-1])
            {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
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
        int len = removeDuplicate(arr);
        for (int i = 0; i < len; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
