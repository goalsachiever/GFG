import java.util.Scanner;

public class TrappingRainWater
{
    static int getWater(int[] arr)
    {   int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0]=arr[0];
        for(int i=1;i< arr.length;i++)
            left[i]=Math.max(arr[i],left[i-1]);
        right[arr.length-1]=arr[arr.length-1];
        for(int i= arr.length-2;i>=0;i--)
            right[i]=Math.max(arr[i],right[i+1]);
        int water =0;
        for(int i=1;i<arr.length-1;i++)
            water = water + Math.min(left[i],right[i])-arr[i];
        return water;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(getWater(arr));
    }
}
