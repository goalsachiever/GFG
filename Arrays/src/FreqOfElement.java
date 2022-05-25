import java.util.Scanner;

public class FreqOfElement
{
    static void freqOfElementSortedArray(int[] arr)
    {
        int  i=1;
        while(i< arr.length)
        {
            int freq = 1;
            while(i< arr.length && arr[i] == arr[i-1])
            {
                freq=freq+1;
                i=i+1;
            }
            System.out.println(arr[i-1]+" frequency is "+freq);
            i=i+1;
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
        freqOfElementSortedArray(arr);
    }
}
