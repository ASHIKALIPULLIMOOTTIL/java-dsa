package dynamic_programming;

public class u_PalindromePartitioning {

    static boolean isPalindrome( String s, int i, int j) {

        while (i < j) {

            if (s.charAt(i)!= s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
             }

    static int solve(int i, String s) {

        if (i == s.length())
            return 0;

        int minCost =
                Integer.MAX_VALUE;

        for (int j = i; j < s.length(); j++) {

            if (isPalindrome(s,i,j)) {

                int cost = 1 + solve(j + 1,s);// 1 for the current palindrome partition.
                                              // solve(j + 1) gives the partitions needed for the remaining string.

                minCost =Math.min(minCost,cost);
            }
        }
  /*
 Iteration 1
j = 0
Substring:
"a"
Palindrome ✅
So recurse on:
ab
cost=3
Iteration 2
j = 1
Substring:
"aa"
Palindrome ✅
Now recurse on:
b
cost=2
Iteration 3
j = 2
Substring:
"aab"
Not a palindrome ❌
Ignore it. */
        return minCost;
    }

    public static void main(String[] args) {

        String s = "aab";

        System.out.println(
                solve(0, s) - 1);//Cuts = Partitions - 1
    }
}

//dp 

/*
import java.util.Arrays;

public class Main {

    static boolean isPalindrome(
            String s,
            int i,
            int j) {

        while (i < j) {

            if (s.charAt(i)
                    != s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    static int solve(int i,
                     String s,
                     int[] dp) {

        if (i == s.length())
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int minCost =
                Integer.MAX_VALUE;

        for (int j = i;
             j < s.length();
             j++) {

            if (isPalindrome(
                    s,
                    i,
                    j)) {

                int cost =
                        1 +
                        solve(j + 1,
                              s,
                              dp);

                minCost =
                        Math.min(
                                minCost,
                                cost);
            }
        }

        return dp[i] =
                minCost;
    }

    public static void main(String[] args) {

        String s = "aab";

        int[] dp =
                new int[s.length()];

        Arrays.fill(dp, -1);

        System.out.println(
                solve(0,
                      s,
                      dp)
                - 1);
    }
}
*/