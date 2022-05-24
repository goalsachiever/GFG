import java.util.Scanner;

public class SecondLargestElement
{
    static int secondLargest(int[] arr)
    {
        int secondLarge = -1, large =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[large])
            {
                secondLarge = large;
                large = i;
            }
            else if(arr[i]!=arr[large])
            {
                if(secondLarge == -1 || arr[i] > arr[secondLarge] )
                {
                    secondLarge = i;
                }
            }
        }
        return arr[secondLarge];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLargest(arr));
    }
}
