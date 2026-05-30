package dynamic_programming;

import java.util.Arrays;

public class b_ClimbingStairs {

    static int climb(int n, int[] dp) {

        // Base cases
        if (n == 0 || n == 1)
            return 1;

        // Already calculated
        if (dp[n] != -1)
            return dp[n];

        // Store and return
        dp[n] = climb(n - 1, dp) + climb(n - 2, dp);

        return dp[n];
        //To reach stair n:You can come from:
            //stair n-1 by taking 1 step
            //stair n-2 by taking 2 steps
    }

    public static void main(String[] args) {

        int n = 3;

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        System.out.println(climb(n, dp));
    }
}

/*
public class ClimbingStairsTabulation {

    public static void main(String[] args) {

        int n = 5;

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }
}
*/

/*
public class ClimbingStairsOptimized {

    public static void main(String[] args) {

        int n = 5;

        int prev2 = 1;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {

            int curr = prev1 + prev2;

            prev2 = prev1;
            prev1 = curr;
        }

        System.out.println(prev1);
    }
}
*/