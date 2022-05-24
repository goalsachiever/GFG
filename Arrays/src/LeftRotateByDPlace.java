import java.util.Scanner;

public class LeftRotateByDPlace
{
//    static void leftRotateByD(int[] arr, int d)
//    {
//        int[] temp = new int[d];
//        for (int i = 0; i < d; i++) {
//            temp[i] =  arr[i];
//        }
//        for (int i = d; i < arr.length; i++) {
//            arr[i-d] = arr[i];
//        }
//        for (int i = 0; i < d; i++) {
//            arr[arr.length-d+i] = temp[i];
//        }
//    }

//    Reversal Algorithm

    static void leftRotateByD(int[]arr, int d)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    static void reverse(int [] arr ,int low , int high)
    {
        while (low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high --;
            low ++ ;
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
        int d = sc.nextInt();
        leftRotateByD(arr,d);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
