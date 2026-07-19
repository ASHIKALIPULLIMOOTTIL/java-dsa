package dynamic_programming;

public class p_PrintLCS {

    static String printLCS(
            String s1,
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
                                    dp[i][j - 1]);// no match → max of left and top
            }
        }
/*
Step 1: Build the DP table
Rows = s1(i), Columns = s2(j)

         ""  b  d  g  e  k
        +---------------------
""      | 0  0  0  0  0  0
a       | 0  0  0  0  0  0
b       | 0  1  1  1  1  1
c       | 0  1  1  1  1  1
d       | 0  1  2  2  2  2
e       | 0  1  2  2  3  3

So,
dp[5][5] = 3
meaning the LCS length is 3.
*/
        int i = n;
        int j = m;

        StringBuilder ans =
                new StringBuilder();

        while (i > 0 && j > 0) {

            if (s1.charAt(i - 1)
                    == s2.charAt(j - 1)) {

                ans.append(
                        s1.charAt(i - 1));

                i--;
                j--;// Move Diagonally Up
            }

            else if (dp[i - 1][j]
                    > dp[i][j - 1])

                i--;// Move Up

            else

                j--;// Move Left
        }
        //You choose the direction with the larger DP value because it represents a longer common subsequence.
        return ans.reverse()
                  .toString();
    }

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "bdgek";

        System.out.println(
                printLCS(s1, s2));
    }
}
