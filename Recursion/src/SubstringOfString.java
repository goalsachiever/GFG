import java.util.Scanner;

public class SubstringOfString
{
    static void printSub(String str, String curr, int index)
    {
        if (index == str.length())
        {
            System.out.println(curr+" ");
            return;
        }
        printSub(str,curr,index+1);
        printSub(str,curr+str.charAt(index),index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String curr="";
        int index =0;
        printSub(str,curr,index);
    }
}
