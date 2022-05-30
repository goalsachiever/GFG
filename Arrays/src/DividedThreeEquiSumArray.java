
public class DividedThreeEquiSumArray {

    // First segment's end index
    public static int pos1 = -1;

    // Third segment's start index
    public static int pos2 = -1;

    // This function returns true if the array
    // can be divided into three equal sum segments
    public static boolean equiSumUtil(int[] arr)
    {
        int n = arr.length;

        // Prefix Sum Array
        int[] pre = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            pre[i] = sum;
        }

        // Suffix Sum Array
        int[] suf = new int[n];
        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i];
            suf[i] = sum;
        }

        // Stores the total sum of the array
        int total_sum = sum;

        int i = 0, j = n - 1;
        while (i < j - 1) {

            if (pre[i] == total_sum / 3) {
                pos1 = i;
            }

            if (suf[j] == total_sum / 3) {
                pos2 = j;
            }

            if (pos1 != -1 && pos2 != -1) {

                // We can also take pre[pos2 - 1] - pre[pos1] ==
                // total_sum / 3 here.
                if (suf[pos1 + 1] - suf[pos2] == total_sum / 3) {
                    return true;
                }
                else {
                    return false;
                }
            }

            if (pre[i] < suf[j]) {
                i++;
            }
            else {
                j--;
            }
        }

        return false;
    }

    public static void equiSum(int[] arr)
    {
        boolean ans = equiSumUtil(arr);
        if (ans) {

            System.out.print("First Segment : ");
            for (int i = 0; i <= pos1; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();

            System.out.print("Second Segment : ");
            for (int i = pos1 + 1; i < pos2; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();

            System.out.print("Third Segment : ");
            for (int i = pos2; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
        else {
            System.out.println("Array cannot be " +
                    "divided into three equal sum segments");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 3, 6, 2, 7, 1, 2, 8 };
        equiSum(arr);
    }
}
