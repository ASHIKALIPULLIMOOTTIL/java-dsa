public class MaxSubarrayBrute {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1};
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}