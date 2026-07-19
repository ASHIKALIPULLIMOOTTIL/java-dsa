package dynamic_programming;
/* 
public class o_LCS {

    static int solve(int i,
                     int j,
                     String s1,
                     String s2) {

        if (i < 0 || j < 0)
            return 0;
        // if equal
        if (s1.charAt(i)== s2.charAt(j)){
            return 1 +
                    solve(i - 1,
                          j - 1,
                          s1,
                          s2);// move both pointers
                        }
        // if not equal
        return Math.max(
                solve(i - 1, j, s1, s2),
                solve(i, j - 1, s1, s2));// move one pointer at a time
    }

    public static void main(String[] args) {

        String s1 = "acd";
        String s2 = "ced";

        System.out.println(
                solve(
                        s1.length() - 1,
                        s2.length() - 1,
                        s1,
                        s2));
    }
}
*/
//dp

/*
import java.util.Arrays;

public class Main {

    static int solve(int i,
                     int j,
                     String s1,
                     String s2,
                     int[][] dp) {

        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (s1.charAt(i)
                == s2.charAt(j))

            return dp[i][j] =
                    1 +
                    solve(i - 1,
                          j - 1,
                          s1,
                          s2,
                          dp);

        return dp[i][j] =
                Math.max(
                        solve(i - 1,
                              j,
                              s1,
                              s2,
                              dp),

                        solve(i,
                              j - 1,
                              s1,
                              s2,
                              dp));
    }

    public static void main(String[] args) {

        String s1 = "acd";
        String s2 = "ced";

        int[][] dp =
                new int[s1.length()]
                        [s2.length()];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(
                solve(
                        s1.length() - 1,
                        s2.length() - 1,
                        s1,
                        s2,
                        dp));
    }
}
*/


public class o_LCS {

    static int lcs(String s1,
                   String s2) {

        int n = s1.length();
        int m = s2.length();

        int[][] dp =
                new int[n + 1][m + 1];//first row and column is 0

        // Build DP Table
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i - 1)
                        == s2.charAt(j - 1))

                    dp[i][j] =
                            1 +
                            dp[i - 1][j - 1];// match → diagonal

                else

                    dp[i][j] =
                            Math.max(
                                    dp[i - 1][j],
                                    dp[i][j - 1]);// no match → max(up,left)
            }
        }

        return dp[n][m];
    }
//This match → diagonal, no match → max(up,left) pattern is the foundation of almost all DP on Strings problems.
    public static void main(String[] args) {

        System.out.println(
                lcs("acd", "ced"));
    }
}

/*
The extra row and column serve two purposes:

Represent the empty string (base case: LCS with an empty string is 0).
Prevent out-of-bounds access (such as dp[-1][-1]) and eliminate the need for special-case checks, making the recurrence work uniformly for every cell.
*/