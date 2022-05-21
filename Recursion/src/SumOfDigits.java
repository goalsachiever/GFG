import java.util.Scanner;

public class SumOfDigits
{
    static int sumOFdigits(int n)
    {
        if(n<10)
            return n;
        return n%10 + sumOFdigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOFdigits(n));
    }
}
