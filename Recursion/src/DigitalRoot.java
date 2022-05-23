import java.util.Scanner;

public class DigitalRoot
{
    static int digitalRoot(int n)
    {
        int root = 0;
        while (n > 0 || root > 9)
        {
            if (n == 0) {
                n = root;
                root = 0;
            }

            root += n % 10;
            n /= 10;
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitalRoot(n));
    }
}
