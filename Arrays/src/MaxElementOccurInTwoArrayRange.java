import java.util.Scanner;

public class MaxElementOccurInTwoArrayRange
{
    static void prefixSum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            arr[i]=sum;
        }
    }
    static int maxOccuringElement(int[] range1, int[] range2)
    {
        int[] freq = new int[1000];
        for (int i = 0; i < range1.length; i++) {
            freq[range1[i]]++;
            freq[range2[i]+1]--;
        }
        prefixSum(freq);
        int res = 0;
        int max = freq[0];
        for (int i = 1; i < freq.length ; i++) {
            if(freq[i]>max)
            {
                max = freq[i];
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] range1 = new int[n];
        int [] range2 = new int[n];
        for (int i = 0; i < range1.length; i++) {
            range1[i]= sc.nextInt();
        }
        for (int i = 0; i < range2.length; i++) {
            range2[i]= sc.nextInt();
        }

        System.out.println(maxOccuringElement(range1,range2));

    }
}
