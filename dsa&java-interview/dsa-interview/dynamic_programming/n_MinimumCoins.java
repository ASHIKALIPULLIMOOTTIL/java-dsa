package dynamic_programming;

public class n_MinimumCoins {

    static int INF = (int)1e9;

    static int solve(int i,
                     int amount,
                     int[] coins) {

        if (i == 0) {

            if (amount % coins[0] == 0) //Can this one coin alone make the amount(divisible)?
                return amount / coins[0];//give the number of coins needed to make the amount
            return INF;
        }

        int notPick =
                solve(i - 1, amount, coins);

        int pick = INF;

        if (coins[i] <= amount)
            //Coins can be reused
            pick = 1 +
                   solve(i,
                         amount - coins[i],
                         coins); //1 + (minimum coins needed for the remaining amount)

        return Math.min(pick, notPick);
    }

    public static void main(String[] args) {

        int[] coins = {1,2,5};
        int amount = 11;

        int ans =
                solve(coins.length - 1,
                      amount,
                      coins);

        System.out.println(
                ans >= INF ? -1 : ans);
    }
}

//dp

/*
import java.util.Arrays;

public class Main {

    static int INF = (int)1e9;

    static int solve(int i,
                     int amount,
                     int[] coins,
                     int[][] dp) {

        if (i == 0) {

            if (amount % coins[0] == 0)
                return amount / coins[0];

            return INF;
        }

        if (dp[i][amount] != -1)
            return dp[i][amount];

        int notPick =
                solve(i - 1,
                      amount,
                      coins,
                      dp);

        int pick = INF;

        if (coins[i] <= amount)
            pick = 1 +
                   solve(i,
                         amount - coins[i],
                         coins,
                         dp);

        return dp[i][amount] =
                Math.min(pick,
                         notPick);
    }

    public static void main(String[] args) {

        int[] coins = {1,2,5};
        int amount = 11;

        int[][] dp =
                new int[coins.length][amount + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        int ans =
                solve(coins.length - 1,
                      amount,
                      coins,
                      dp);

        System.out.println(
                ans >= INF ? -1 : ans);
    }
}
*/