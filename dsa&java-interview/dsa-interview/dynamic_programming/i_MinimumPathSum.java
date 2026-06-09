package dynamic_programming;
//recursion
public class i_MinimumPathSum{

    static int minPath(int i, int j, int[][] grid) {

        if (i == 0 && j == 0)
            return grid[0][0];

        if (i < 0 || j < 0)
            return (int)1e9;

        int up =
                grid[i][j]
                + minPath(i - 1, j, grid);

        int left =
                grid[i][j]
                + minPath(i, j - 1, grid);

        return Math.min(up, left);
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        int m = grid.length;
        int n = grid[0].length;

        System.out.println(
                minPath(m - 1, n - 1, grid));
    }
}

//dp
/*
import java.util.Arrays;

public class Main {

    static int minPath(int i, int j,
                       int[][] grid,
                       int[][] dp) {

        if (i == 0 && j == 0)
            return grid[0][0];

        if (i < 0 || j < 0)
            return (int)1e9;

        if (dp[i][j] != -1)
            return dp[i][j];

        int up =
                grid[i][j]
                + minPath(i - 1, j,
                          grid, dp);

        int left =
                grid[i][j]
                + minPath(i, j - 1,
                          grid, dp);

        return dp[i][j] =
                Math.min(up, left);
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(
                minPath(
                        m - 1,
                        n - 1,
                        grid,
                        dp));
    }
}
*/

/*
public class Main {

    static int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                    continue;
                }

                int up = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;

                if (i > 0)
                    up = grid[i][j]
                         + dp[i - 1][j];

                if (j > 0)
                    left = grid[i][j]
                           + dp[i][j - 1];

                dp[i][j] =
                        Math.min(up, left);
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        System.out.println(
                minPathSum(grid));
    }
}
*/

/*
public class Main {

    static int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] prev = new int[n];

        for (int i = 0; i < m; i++) {

            int[] curr = new int[n];

            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    curr[j] = grid[i][j];
                    continue;
                }

                int up = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;

                if (i > 0)
                    up = grid[i][j] + prev[j];

                if (j > 0)
                    left = grid[i][j] + curr[j - 1];

                curr[j] = Math.min(up, left);
            }

            prev = curr;
        }

        return prev[n - 1];
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        System.out.println(
                minPathSum(grid));
    }
}
*/