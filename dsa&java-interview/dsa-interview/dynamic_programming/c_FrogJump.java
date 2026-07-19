package dynamic_programming;

import java.util.Arrays;

public class c_FrogJump {

    static int solve(int ind, int[] height, int[] dp) {

        // Base case
        if (ind == 0)
            return 0;

        // Already calculated
        if (dp[ind] != -1)
            return dp[ind];

        // One step jump
        int left = solve(ind - 1, height, dp)
                + Math.abs(height[ind] - height[ind - 1]);

        // Two step jump
        int right = Integer.MAX_VALUE;

        if (ind > 1) {

            right = solve(ind - 2, height, dp)
                    + Math.abs(height[ind] - height[ind - 2]);
        }
        // Store minimum
        dp[ind] = Math.min(left, right);

        return dp[ind];
    }
    public static void main(String[] args) {

        int[] height = {30, 10, 60, 10, 60, 50};

        int n = height.length;

        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        System.out.println(solve(n - 1, height, dp));
    }
}

/*
public class FrogJumpTabulation {

    public static void main(String[] args) {

        int[] height = {30, 10, 60, 10, 60, 50};

        int n = height.length;

        int[] dp = new int[n];

        dp[0] = 0;

        for (int i = 1; i < n; i++) {

            int left = dp[i - 1]
                    + Math.abs(height[i] - height[i - 1]);

            int right = Integer.MAX_VALUE;

            if (i > 1) {

                right = dp[i - 2]
                        + Math.abs(height[i] - height[i - 2]);
            }

            dp[i] = Math.min(left, right);
        }

        System.out.println(dp[n - 1]);
    }
}
*/

/*
public class FrogJumpOptimized {

    public static void main(String[] args) {

        int[] height = {30, 10, 60, 10, 60, 50};

        int n = height.length;

        int prev = 0;
        int prev2 = 0;

        for (int i = 1; i < n; i++) {

            int left = prev
                    + Math.abs(height[i] - height[i - 1]);

            int right = Integer.MAX_VALUE;

            if (i > 1) {

                right = prev2
                        + Math.abs(height[i] - height[i - 2]);
            }

            int curr = Math.min(left, right);

            prev2 = prev;
            prev = curr;
        }

        System.out.println(prev);
    }
}
*/