import java.util.Scanner;

public class EquillibriumPoint
{

    
    static boolean EquillibriumPointArray(int [] arr)
    {
        int r_sum=0;   // suffix sum
        for (int i = 0; i < arr.length ; i++) {
            r_sum+=arr[i];
        }
        int l_sum=0;   // prefix sum
        for (int i = 0; i < arr.length; i++) {
            if(l_sum == r_sum-arr[i])
                return true;
            l_sum+=arr[i];
            r_sum-=arr[i];
        }
        return false;
    }

    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(EquillibriumPointArray(arr));
    }
}
