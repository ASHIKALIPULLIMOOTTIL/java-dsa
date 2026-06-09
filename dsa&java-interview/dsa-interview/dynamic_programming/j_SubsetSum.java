package dynamic_programming;

public class j_SubsetSum{

    static boolean solve(int i, int target, int[] arr) {

        if (target == 0)
            return true;

        if (i == 0)
            return arr[0] == target;

        boolean notPick =
                solve(i - 1, target, arr);

        boolean pick = false;

        if (arr[i] <= target){
            pick =solve(i - 1,
                          target - arr[i],
                          arr);
            }
        return pick || notPick;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int target = 4;

        System.out.println( solve(arr.length - 1,target,arr));
    }
}
//dp
/*
import java.util.Arrays;

public class Main {

    static int solve(int i,
                     int target,
                     int[] arr,
                     int[][] dp) {

        if (target == 0)
            return 1;

        if (i == 0)
            return arr[0] == target ? 1 : 0;

        if (dp[i][target] != -1)
            return dp[i][target];

        int notPick =
                solve(i - 1,
                      target,
                      arr,
                      dp);

        int pick = 0;

        if (arr[i] <= target)
            pick =
                    solve(i - 1,
                          target - arr[i],
                          arr,
                          dp);

        return dp[i][target] =
                (pick == 1 || notPick == 1)
                        ? 1 : 0;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int target = 4;

        int[][] dp =
                new int[arr.length][target + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(
                solve(arr.length - 1,
                      target,
                      arr,
                      dp) == 1);
    }
}
*/

/*
public class Main {

    static boolean subsetSumToK(
            int n,
            int k,
            int[] arr) {

        boolean[][] dp =
                new boolean[n][k + 1];

        for (int i = 0; i < n; i++)
            dp[i][0] = true;

        if (arr[0] <= k)
            dp[0][arr[0]] = true;

        for (int i = 1; i < n; i++) {

            for (int target = 1;
                 target <= k;
                 target++) {

                boolean notPick =
                        dp[i - 1][target];

                boolean pick = false;

                if (arr[i] <= target)
                    pick =
                            dp[i - 1]
                              [target - arr[i]];

                dp[i][target] =
                        pick || notPick;
            }
        }

        return dp[n - 1][k];
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        System.out.println(
                subsetSumToK(
                        arr.length,
                        4,
                        arr));
    }
}
*/

/*
public class Main {

    static boolean subsetSumToK(
            int n,
            int k,
            int[] arr) {

        boolean[] prev =
                new boolean[k + 1];

        prev[0] = true;

        if (arr[0] <= k)
            prev[arr[0]] = true;

        for (int i = 1; i < n; i++) {

            boolean[] curr =
                    new boolean[k + 1];

            curr[0] = true;

            for (int target = 1;
                 target <= k;
                 target++) {

                boolean notPick =
                        prev[target];

                boolean pick = false;

                if (arr[i] <= target)
                    pick =
                            prev[target - arr[i]];

                curr[target] =
                        pick || notPick;
            }

            prev = curr;
        }

        return prev[k];
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        System.out.println(
                subsetSumToK(
                        arr.length,
                        4,
                        arr));
    }
}
*/