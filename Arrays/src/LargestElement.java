import java.util.Scanner;

public class LargestElement
{
//    O(n)
    public static int largestElement(int[] arr)
    {
        int large = arr[0];
        for (int ele: arr)
        {
            if(ele > large)
                large = ele;
        }
        return large;
    }

//    O(nlog(n))
//    Arrays.sort(arr);
//    return arr[arr.length-1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(largestElement(arr));
    }
}
