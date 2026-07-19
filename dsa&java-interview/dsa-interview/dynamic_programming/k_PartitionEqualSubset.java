package dynamic_programming;

import java.util.Arrays;
//same function of subsetSum
public class k_PartitionEqualSubset {

    static boolean solve(int i,
                         int target,
                         int[] nums,
                         int[][] dp) {

        if (target == 0)
            return true;

        if (i == 0)
            return nums[0] == target;

        if (dp[i][target] != -1)
            return dp[i][target] == 1;

        boolean notPick =
                solve(i - 1,
                      target,
                      nums,
                      dp);

        boolean pick = false;

        if (nums[i] <= target)
            pick =
                    solve(i - 1,
                          target - nums[i],
                          nums,
                          dp);

        dp[i][target] =
                (pick || notPick) ? 1 : 0;

        return pick || notPick;
    }

    public static void main(String[] args) {

        int[] nums = {1,5,11,5};

        int sum = 0;

        for (int x : nums)
            sum += x;

       if (sum % 2 != 0) {
          System.out.println(false);//if sum is odd
           return;
         }
        int target = sum / 2;

        int[][] dp =
                new int[nums.length][target + 1];//Number of ways to form target using elements from 0...i

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(
                solve(nums.length - 1,
                      target,
                      nums,
                      dp));
    }
}