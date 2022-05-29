import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctElementEveryWindow
{

    static void printDistinctElement(int[] arr , int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++)
        {
           map.put(arr[i],map.getOrDefault(arr[i],0)+1) ;
        }
        System.out.print(map.size()+" ");
        for (int i = k; i <arr.length ; i++) {
            if (map.get(arr[i-k])==1)
                map.remove(arr[i-k]);
            else
                map.put(arr[i-k],map.get(arr[i-k])-1);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            System.out.print(map.size()+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        int k = sc.nextInt();

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        printDistinctElement(arr,k);
    }
}
