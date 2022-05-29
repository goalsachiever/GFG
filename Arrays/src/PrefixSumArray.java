import java.util.Scanner;

public class PrefixSumArray
{
    static int[] prefixSum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             sum += arr[i];
             arr[i] = sum;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
         }
        prefixSum(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
