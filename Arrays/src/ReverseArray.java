import java.util.Scanner;

public class ReverseArray
{
    static void reverse(int[] arr)
    {
        int high = arr.length-1;
        int low = 0;
        while(low<high)
        {
            int temp = arr[low];
            arr[low]= arr[high];
            arr[high] = temp;
            high--;
            low++;
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
        reverse(arr);
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
    }

}
