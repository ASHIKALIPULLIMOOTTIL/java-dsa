package dynamic_programming;
//recursion
public class g_GridUniquePaths {

    static int countWays(int i, int j) {

        if (i == 0 && j == 0)
            return 1;

        if (i < 0 || j < 0)
            return 0;

        int up = countWays(i - 1, j);
        int left = countWays(i, j - 1);

        return up + left;
    }

    public static void main(String[] args) {

        int m = 3, n = 3;

        System.out.println(
                countWays(m - 1, n - 1));
    }
}

//dp
/*
import java.util.Arrays;

public class Main {

    static int countWays(int i, int j,
                         int[][] dp) {

        if (i == 0 && j == 0)
            return 1;

        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int up = countWays(i - 1, j, dp);
        int left = countWays(i, j - 1, dp);

        return dp[i][j] = up + left;
    }

    public static void main(String[] args) {

        int m = 3, n = 3;

        int[][] dp = new int[m][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(
                countWays(m - 1, n - 1, dp));
    }
}
*/

/*
public class Main {

    static int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                if (i > 0)
                    up = dp[i - 1][j];

                if (j > 0)
                    left = dp[i][j - 1];

                dp[i][j] = up + left;
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {

        System.out.println(
                uniquePaths(3, 3));
    }
}
*/

/*
public class Main {

    static int uniquePaths(int m, int n) {

        int[] prev = new int[n];

        for (int i = 0; i < m; i++) {

            int[] curr = new int[n];

            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    curr[j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                if (i > 0)
                    up = prev[j];

                if (j > 0)
                    left = curr[j - 1];

                curr[j] = up + left;
            }

            prev = curr;
        }

        return prev[n - 1];
    }

    public static void main(String[] args) {

        System.out.println(
                uniquePaths(3, 3));
    }
}
*/