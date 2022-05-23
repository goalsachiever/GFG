

import java.util.Scanner;

public class JosephusProblem
{
    //Starting from 0 to n-1
    static int jos(int n, int k )
    {
        if(n==1)
            return  0;
        return (jos(n-1,k)+k)%n;
    }
    //Starting from 1 to n
    static int myJos(int n, int k)
    {
        return jos(n, k) + 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(myJos(n,k));
    }
}
