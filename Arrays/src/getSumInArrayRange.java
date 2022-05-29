import java.util.Scanner;

public class getSumInArrayRange
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

    static int getSumArray( int[] arr , int l , int r)
    {
        if(l!=0)
        {
            return arr[r]-arr[l-1];
        }
        else
            return arr[r];
    }


    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        prefixSum(arr);

        System.out.println(getSumArray(arr,0 , 2));
        System.out.println(getSumArray(arr,2 , 2));
        System.out.println(getSumArray(arr,2 , 4));



    }
}
