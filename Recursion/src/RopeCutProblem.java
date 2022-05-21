import java.util.Scanner;

//Given a rope of length n you need to find max no. of pieces you can make such that length
//of every pieces' is in set [a,b,c] for given three values a,b,c.

public class RopeCutProblem
{
    static  int maxCut(int n, int a, int b, int c)
    {
        if(n==0) return 0;
        if(n<0) return -1;

        int res = Math.max(
                            Math.max(   maxCut(n-a,a,b,c),
                                        maxCut(n-b,a,b,c)
                                    ),
                            maxCut(n-c,a,b,c)
                           );

        if(res==-1)
            return -1;
        return res+1;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ropeLength = sc.nextInt();
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();

        System.out.println(maxCut(ropeLength,l1,l2,l3));

    }
}
