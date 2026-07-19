package dynamic_programming;
//In Partition DP:Instead of choosing pick/not pick, we choose where to partition (split) the problem.
public class t_MCM {

    static int solve(int i,
                     int j,
                     int[] arr) {

        if (i == j)
            return 0;

        int mini = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) { //two ways

            int cost =
                    solve(i, k, arr)//leftPart 
                  + solve(k + 1, j, arr)//rightPart
                  + arr[i - 1] * arr[k] * arr[j];//costToCombine
         //=> if k=1 A|BC cost = 0 + 9000(cost of BC= 0+0+30*5*60=9000) + 10*30*60(cost of multiply A with (BC)) = 27000 
         //=> if k=2 AB|C cost = 1500(cost of AB= 0+0+10*30*5=1500) + 0 + 10*5*60(cost of multiply (AB) with C) = 4500 
            mini = Math.min(mini, cost);
        }

        return mini;//return minimum cost
    }

    public static void main(String[] args) {

        int[] arr = {10,30,5,60};
 /*
    A -> 10 x 30
    B -> 30 x 5
    C -> 5 x 60
    Ways of multiplying A, B, C
    1. (AB)C
       First multiply A and B
       Cost = 10 * 30 * 5 = 1500
       Resultant matrix = 10 x 5
       Now multiply (AB) with C
       Cost = 10 * 5 * 60 = 3000
       Total Cost = 1500 + 3000 = 4500
    2. A(BC)
       First multiply B and C
       Cost = 30 * 5 * 60 = 9000
       Resultant matrix = 30 x 60
       Now multiply A with (BC)
       Cost = 10 * 30 * 60 = 18000
       Total Cost = 9000 + 18000 = 27000
    Minimum Cost = 4500
*/
        System.out.println(
                solve(1,
                      arr.length - 1,
                      arr));//solve(1, 3, arr); A=1, B=2, and C=3.
    }
}

/*
import java.util.Arrays;

public class Main {

    static int solve(int i,
                     int j,
                     int[] arr,
                     int[][] dp) {

        if (i == j)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int mini = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {

            int cost =
                    solve(i, k, arr, dp)
                  + solve(k + 1, j, arr, dp)
                  + arr[i - 1] * arr[k] * arr[j];

            mini = Math.min(mini, cost);
        }

        return dp[i][j] = mini;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int n = arr.length;

        int[][] dp =
                new int[n][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(
                solve(1,
                      n - 1,
                      arr,
                      dp));
    }
}
*/