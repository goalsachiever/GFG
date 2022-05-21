import java.util.Scanner;

public class TowerOfHanoi
{
    static void TOH(int n, char a, char b, char c)
    {
        if(n==1)
        {
            System.out.println("MOV 1 from "+a+" to "+c);
            return;
        }
        TOH(n-1,a,c,b);
        System.out.println("MOV "+n+" from "+a+" to "+c);
        TOH(n-1,b,a,c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int disc = sc.nextInt();
        char a ='A';
        char b = 'B';
        char c = 'C';
        TOH(disc,a,b,c);
    }
}
