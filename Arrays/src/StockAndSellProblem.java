import java.util.Scanner;

public class StockAndSellProblem
{

    static int stockBuyNaiveApproach(int[] arr, int start, int end)
    {
        if(start>=end)
            return 0;
        int profit = 0;
        for (int i = start; i < end; i++)
        {
            for (int j = i+1; j <= end; j++)
            {
                int curr_profit = arr[j] - arr[i]
                        + stockBuyNaiveApproach(arr, start , i-1)
                        + stockBuyNaiveApproach(arr,j+1,end);
                profit = Math.max(profit,curr_profit);
            }
        }
        return profit;
    }

    static int stockButSellBetterApproach(int[] price)
    {
        int profit = 0;
        for (int i = 1; i < price.length; i++)
        {
            if(price[i]>price[i-1])
                profit+=price[i]-price[i-1];
        }
        return profit;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(stockBuyNaiveApproach(arr,0, arr.length-1));
        System.out.println(stockButSellBetterApproach(arr));
    }
}
