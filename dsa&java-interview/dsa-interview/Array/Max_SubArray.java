package Array;
/* 
public class Max_SubArray {
    public static void main(String[] args) {
        int a[] = {1, -3, 6, 9, -2, 4};
        int n = a.length;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += a[j];          // sum of subarray from i to j
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
*/

//Kadane’s Algorithm
public class Max_SubArray {

    public static void maxSubArray(int[] arr) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        int start = 0;   // temporary start
        int s = 0;       // final start
        int e = 0;       // final end

        for (int i = 0; i < arr.length; i++) {

            if (current_sum == 0) {
                start = i;  // possible new start
            }

            current_sum += arr[i];

            if (current_sum > max_sum) {
                max_sum = current_sum;
                s = start;
                e = i;
            }

            if (current_sum < 0) {
                current_sum = 0;
            }
        }

        System.out.println("Max Sum = " + max_sum);
        System.out.println("Start Index = " + s);
        System.out.println("End Index = " + e);
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
    }
}

