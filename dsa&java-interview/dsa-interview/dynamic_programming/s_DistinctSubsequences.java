package dynamic_programming;

public class s_DistinctSubsequences {

    static int solve(int i,
                     int j,
                     String s,
                     String t) {
        //base cases
        if (j < 0)
            return 1;// If we have matched all characters of t, we found a valid subsequence

        if (i < 0)
            return 0;// If we have exhausted s but still have characters left in t, no valid subsequence can be formed

        if (s.charAt(i) == t.charAt(j))

            return solve(i - 1,
                         j - 1,
                         s,
                         t)
                 +
                   solve(i - 1,
                         j,
                         s,
                         t);// If characters match, we can either include this character in the subsequence or exclude it(pick or non pick)
                         //Only i moves back because we skipped a character from the source string.
/*Why do we add them?
Because both choices produce different valid subsequences.
Total Ways=Ways using this character+Ways without using this character */

        return solve(i - 1,
                     j,
                     s,
                     t);// If characters don't match, we can only exclude this character from the subsequence
    }

    public static void main(String[] args) {

        System.out.println(
                solve(
                        "rabbbit".length()-1,
                        "rabbit".length()-1,
                        "rabbbit",
                        "rabbit"));
    }
}

//dp
/*
import java.util.Arrays;

public class Main {

    static int solve(int i,
                     int j,
                     String s,
                     String t,
                     int[][] dp) {

        if (j < 0)
            return 1;

        if (i < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (s.charAt(i) == t.charAt(j))

            return dp[i][j] =
                    solve(i - 1,
                          j - 1,
                          s,
                          t,
                          dp)
                  +
                    solve(i - 1,
                          j,
                          s,
                          t,
                          dp);

        return dp[i][j] =
                solve(i - 1,
                      j,
                      s,
                      t,
                      dp);
    }

    public static void main(String[] args) {

        String s = "rabbbit";
        String t = "rabbit";

        int[][] dp =
                new int[s.length()]
                        [t.length()];

        for (int[] row : dp)
            Arrays.fill(row,-1);

        System.out.println(
                solve(
                        s.length()-1,
                        t.length()-1,
                        s,
                        t,
                        dp));
    }
}
*/

/*
public class Main {

    static int numDistinct(
            String s,
            String t) {

        int n = s.length();
        int m = t.length();

        int[][] dp =
                new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (s.charAt(i - 1)
                        == t.charAt(j - 1))

                    dp[i][j] =
                            dp[i - 1][j - 1]
                          + dp[i - 1][j];

                else

                    dp[i][j] =
                            dp[i - 1][j];
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {

        System.out.println(
                numDistinct(
                        "rabbbit",
                        "rabbit"));
    }
}
*/