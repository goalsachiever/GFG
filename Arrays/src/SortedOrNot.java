import java.util.Scanner;

public class SortedOrNot
{
    static boolean sortedorNot(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
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
        System.out.println(sortedorNot(arr));
    }
}
