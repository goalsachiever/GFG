import java.util.Scanner;

public class SumOfFirstNnumber
{
    static int sumOfFirstNnaturalNumber(int n)
    {
        if(n==1)
            return 1;
        return n+sumOfFirstNnaturalNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfFirstNnaturalNumber(n));
    }
}
