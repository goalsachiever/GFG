import java.util.Scanner;

public class MinimumConsecutiveFlips
{
    static void printGroup(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i]!=arr[i-1])
                if(arr[i]!=arr[0])
                    System.out.print("Starts from "+i+" ");
                else
                    System.out.println("end here "+i);
        }
        if(arr[arr.length-1]!=arr[0])
            System.out.println("end here "+(arr.length-1));
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
        printGroup(arr);
    }
}
