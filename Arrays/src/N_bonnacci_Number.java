import java.util.Scanner;

public class N_bonnacci_Number
{
    static void Print_N_bonnacci_Number(int n , int m)
    {
        int[] arr=new int[m];
        int sum=1,j=0;
        arr[n-1]=1;
        arr[n]=1;
        sum=1;
        for(int i=n+1;i<m;i++)
        {
            sum=sum-arr[j]+arr[i-1];
            arr[i]=sum;
            j++;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Print_N_bonnacci_Number(n,m);

    }
}
