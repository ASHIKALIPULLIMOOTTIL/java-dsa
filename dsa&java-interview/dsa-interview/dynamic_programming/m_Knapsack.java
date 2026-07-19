package dynamic_programming;
public class m_Knapsack {

    static int solve(int i,
                     int W,
                     int[] wt,
                     int[] val) {

        if (i == 0) {

            if (wt[0] <= W)
                return val[0];//If it fits -> take its value

            return 0; //If it doesn't fit -> take nothing
        }

        int notPick =
                solve(i - 1, W, wt, val);

        int pick = Integer.MIN_VALUE;

        if (wt[i] <= W)
            pick = val[i] +
                   solve(i - 1,
                         W - wt[i],
                         wt,
                         val);

        return Math.max(pick, notPick);
    }
    /*
wt[] = weights of items
val[] = values of items
W = maximum capacity of knapsack

Find the maximum value that can be obtained.
*/

    public static void main(String[] args) {

        int[] wt = {1,2,4,5};
        int[] val = {5,4,8,6};

        int W = 5;

        System.out.println(
                solve(wt.length - 1,
                      W,
                      wt,
                      val));
    }
}


//dp
/*
import java.util.Arrays;

public class Main {

    static int solve(int i,
                     int W,
                     int[] wt,
                     int[] val,
                     int[][] dp) {

        if (i == 0) {

            if (wt[0] <= W)
                return val[0];

            return 0;
        }

        if (dp[i][W] != -1)
            return dp[i][W];

        int notPick =
                solve(i - 1,
                      W,
                      wt,
                      val,
                      dp);

        int pick = Integer.MIN_VALUE;

        if (wt[i] <= W)
            pick = val[i] +
                   solve(i - 1,
                         W - wt[i],
                         wt,
                         val,
                         dp);

        return dp[i][W] =
                Math.max(pick,
                         notPick);
    }

    public static void main(String[] args) {

        int[] wt = {1,2,4,5};
        int[] val = {5,4,8,6};
        int W = 5;

        int[][] dp =
                new int[wt.length][W + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(
                solve(wt.length - 1,
                      W,
                      wt,
                      val,
                      dp));
    }
}
*/