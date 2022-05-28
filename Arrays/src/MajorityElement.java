import java.util.Scanner;

public class MajorityElement
{
    // Moree's Voting Algorithm
    static int findMajorityElement(int[] arr)
    {
        int res=0, count =1;
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]==arr[i-1])
                count++;
            else
                count--;
            if(count==0)
            {
                res = i;
                count =1;
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[res]==arr[i])
            {
                count++;
            }
        }
        if(count<= arr.length/2) return  -1;
        else
            return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(arr[findMajorityElement(arr)]);

    }
}
