import java.util.Scanner;

public class MovesAllZeroesToEnd
{
    static void movesZeroesEnd(int[] arr)
    {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=0)
            {
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i] = temp;
                i++;
            }
        }
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
        movesZeroesEnd(arr);
        for (int ele :arr) {
            System.out.print(ele+" ");
        }
    }
}
