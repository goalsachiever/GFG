import java.util.Scanner;

public class PallidromeOrNot
{
    static boolean pallindrome(String str , int start , int end)
    {
        if(start > end)
        {
            return true;
        }
        return (str.charAt(start)==str.charAt(end)
                            &&
                pallindrome(str,start+1,end-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.next();
        if(pallindrome(str, 0, str.length()-1))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
