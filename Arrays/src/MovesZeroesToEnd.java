import java.util.Scanner;

public class MovesZeroesToEnd
{
    static void moveZeroEnd(int []arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

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
        moveZeroEnd(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
