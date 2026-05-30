package dynamic_programming;

import java.util.Arrays;

public class d_FrogJumpKDistance {

    static int solve(int ind, int[] height, int[] dp, int k) {

        // Base case
        if (ind == 0)
            return 0;

        // Already calculated
        if (dp[ind] != -1)
            return dp[ind];

        int minSteps = Integer.MAX_VALUE;

        // Try all jumps from 1 to k
        for (int j = 1; j <= k; j++) {

            if (ind - j >= 0) {

                int jump = solve(ind - j, height, dp, k)
                        + Math.abs(height[ind] - height[ind - j]);

                minSteps = Math.min(minSteps, jump);
            }
        }

       // dp[ind] = minSteps;

        return minSteps;
    }

    public static void main(String[] args) {

        int[] height = {30, 10, 60, 10, 60, 50};

        int n = height.length;

        int k = 2;

        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        System.out.println(solve(n - 1, height, dp, k));
    }
}

/*
import java.util.*;

public class FrogJumpKTabulation {

    public static void main(String[] args) {

        int[] height = {30, 10, 60, 10, 60, 50};

        int n = height.length;

        int k = 2;

        int[] dp = new int[n];

        dp[0] = 0;

        for (int i = 1; i < n; i++) {

            int minSteps = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {

                if (i - j >= 0) {

                    int jump = dp[i - j]
                            + Math.abs(height[i] - height[i - j]);

                    minSteps = Math.min(minSteps, jump);
                }
            }

            dp[i] = minSteps;
        }

        System.out.println(dp[n - 1]);
    }
}
*/

/*

*/