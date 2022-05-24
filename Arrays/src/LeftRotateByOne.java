import java.util.Scanner;

public class LeftRotateByOne
{
    static void leftRotateOne(int [] arr)
    {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
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
        leftRotateOne(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
