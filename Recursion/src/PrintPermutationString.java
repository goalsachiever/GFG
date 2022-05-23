import java.util.Scanner;

public class PrintPermutationString
{
    static String swap(String str, int i, int j)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    static void permute(String str , int i)
    {
        if(i==str.length()-1)
        {
            System.out.println(str+" ");
            return;
        }
        for(int j=i;j<str.length();j++)
        {
            str = swap(str,i,j);
            permute(str,i+1);
            str = swap(str,i,j);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permute(str,0);
    }
}
