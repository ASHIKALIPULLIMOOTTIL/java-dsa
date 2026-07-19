package dynamic_programming;

public class r_LPS {

    static int lcs(String s1,
                   String s2) {

        int n = s1.length();
        int m = s2.length();

        int[][] dp =
                new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i - 1)
                        == s2.charAt(j - 1))

                    dp[i][j] =
                            1 +
                            dp[i - 1][j - 1];

                else

                    dp[i][j] =
                            Math.max(
                                    dp[i - 1][j],
                                    dp[i][j - 1]);
            }
        }

        return dp[n][m];
    }

    static int longestPalindromeSubseq(
            String s) {

        String rev =
                new StringBuilder(s)
                        .reverse()
                        .toString();

        return lcs(s, rev);// LCS of the string and its reverse gives the length of the longest palindromic subsequence
    }

    public static void main(String[] args) {

        String s = "bbbab";

        System.out.println(
                longestPalindromeSubseq(s));
    }
}