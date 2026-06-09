package dynamic_programming;
//Given an array of integers, find the maximum sum such that no two chosen elements are adjacent.
//1)recursion
public class e_HouseRobber {

    static int solve(int i, int[] arr) {
        if (i == 0)
            return arr[0];

        if (i < 0)
            return 0;
                                            //For each index, we have two choices:
        int pick = arr[i] + solve(i - 2, arr); //Pick the current element → move to i-2
        int notPick = solve(i - 1, arr);       //Don't pick the current element → move to i-1

        return Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};

        System.out.println(solve(arr.length - 1, arr));
    }
}

//2)memorization
/*
import java.util.Arrays;

public class Main {

    static int solve(int i, int[] arr, int[] dp) {
        if (i == 0)
            return arr[0];

        if (i < 0)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int pick = arr[i] + solve(i - 2, arr, dp);
        int notPick = solve(i - 1, arr, dp);

        return dp[i] = Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};

        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);

        System.out.println(solve(arr.length - 1, arr, dp));
    }
}
*/
//tabulation
/*
public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 9};
        int n = arr.length;

        int[] dp = new int[n];

        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {

            int pick = arr[i];
            if (i > 1)
                pick += dp[i - 2];

            int notPick = dp[i - 1];

            dp[i] = Math.max(pick, notPick);
        }

        System.out.println(dp[n - 1]);
    }
}
*/
//space optimized
/*
public class Main {

    public static int maximumNonAdjacentSum(int[] arr) {

        int prev = arr[0];
        int prev2 = 0;

        for (int i = 1; i < arr.length; i++) {

            int pick = arr[i] + prev2;
            int notPick = prev;

            int curr = Math.max(pick, notPick);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 9};

        System.out.println(maximumNonAdjacentSum(arr));
    }
}
*/
//houserobber2
/*
public class Main {

    static int robLinear(int[] nums, int start, int end) {

        int prev = 0;
        int prev2 = 0;

        for (int i = start; i <= end; i++) {

            int pick = nums[i] + prev2;
            int notPick = prev;

            int curr = Math.max(pick, notPick);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }

    static int houseRobber2(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        int case1 = robLinear(nums, 0, n - 2);
        int case2 = robLinear(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println(houseRobber2(nums));
    }
}
*/