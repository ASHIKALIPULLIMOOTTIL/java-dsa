package dynamic_programming;
//recursion
public class f_Ninja {

    static int solve(int day, int last, int[][] points) {

        if (day == 0) {

            int maxi = 0;

            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    maxi = Math.max(maxi, points[0][task]);
                }
            }

            return maxi;
        }

        int maxi = 0;

        for (int task = 0; task < 3; task++) {

            if (task != last) {

                int curr =
                        points[day][task]
                        + solve(day - 1, task, points);

                maxi = Math.max(maxi, curr);
            }
        }

        return maxi;
    }

    public static void main(String[] args) {

        int[][] points = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };

        int n = points.length;

        System.out.println(solve(n - 1, 3, points));
    }
}
