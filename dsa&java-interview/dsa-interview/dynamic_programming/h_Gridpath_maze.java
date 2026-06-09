package dynamic_programming;


//recursion
public class h_Gridpath_maze {

    static int countWays(int i, int j, int[][] grid) {

        if (i >= 0 && j >= 0 && grid[i][j] == -1)
            return 0;

        if (i == 0 && j == 0)
            return 1;

        if (i < 0 || j < 0)
            return 0;

        int up = countWays(i - 1, j, grid);
        int left = countWays(i, j - 1, grid);

        return up + left;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {0,0,0},
                {0,-1,0},
                {0,0,0}
        };

        int m = grid.length;
        int n = grid[0].length;

        System.out.println(
                countWays(m - 1, n - 1, grid));
    }
}

//dp
/*
import java.util.Arrays;

public class Main {

    static int countWays(int i, int j,
                         int[][] grid,
                         int[][] dp) {

        if (i >= 0 && j >= 0 &&
            grid[i][j] == 1)
            return 0;

        if (i == 0 && j == 0)
            return 1;

        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int up =
                countWays(i - 1, j,
                          grid, dp);

        int left =
                countWays(i, j - 1,
                          grid, dp);

        return dp[i][j] = up + left;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(
                countWays(
                        m - 1,
                        n - 1,
                        grid,
                        dp));
    }
}
*/

/*
public class Main {

    static int uniquePathsWithObstacles(
            int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }

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

        int[][] grid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };

        System.out.println(
                uniquePathsWithObstacles(grid));
    }
}
*/

/*
public class Main {

    static int uniquePathsWithObstacles(
            int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] prev = new int[n];

        for (int i = 0; i < m; i++) {

            int[] curr = new int[n];

            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    curr[j] = 0;
                    continue;
                }

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

        int[][] grid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };

        System.out.println(
                uniquePathsWithObstacles(grid));
    }
}
*/