package dynamic_programming;

/*
Difference Between LCS and Longest Common Substring
Longest Common Subsequence	        Longest Common Substring
Characters can be skipped	        Characters must be continuous
On mismatch → take max(up, left)	On mismatch → reset to 0
Answer is dp[n][m]	                Answer is the maximum value anywhere in the DP table
*/

public class q_longestCommonSubstring {

    static int longestCommonSubstring(
            String s1,
            String s2) {

        int n = s1.length();
        int m = s2.length();

        int[][] dp =
                new int[n + 1][m + 1];

        int ans = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i - 1)
                        == s2.charAt(j - 1)) {

                    dp[i][j] =
                            1 +
                            dp[i - 1][j - 1];// match → diagonal

                    ans =
                            Math.max(
                                    ans,
                                    dp[i][j]);// Update the answer with the maximum value found so far
                }

                else {

                    dp[i][j] = 0;// Reset to 0 on mismatch
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s1 = "abcjklp";
        String s2 = "acjkp";

        System.out.println(
                longestCommonSubstring(
                        s1,
                        s2));
    }
}