import java.util.Scanner;

public class PrintNto1
{
    static void print1toN(int n)
    {
        if(n==0)
            return;
        System.out.print(n+" ");
        print1toN(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1toN(n);
    }
}
