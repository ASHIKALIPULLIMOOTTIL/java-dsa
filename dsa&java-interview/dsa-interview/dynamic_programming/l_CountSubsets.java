package dynamic_programming;
import java.util.Arrays;

public class l_CountSubsets {

    static int solve(int i,
                     int target,
                     int[] arr,
                     int[][] dp) {

        if (i == 0) {                   //arr = {0},target = 0
                                        //count =2 ({},{0})
            if (target == 0 && arr[0] == 0)
                return 2;

            if (target == 0 ||
                target == arr[0])
                return 1;

            return 0;
        }

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
                pick + notPick;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,3};
        int k = 3;

        int[][] dp =
                new int[arr.length][k + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(
                solve(arr.length - 1,
                      k,
                      arr,
                      dp));
    }
}