/* 
package BinarySearch;

public class Square_Root_BruteForce {

    public static int findSqrt(int n) {

        int ans = 1;

        for (int i = 1; i <= n; i++) {

            if (i * i <= n) {
                ans = i;
            }
            else {
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = 28;

        int result = findSqrt(n);

        System.out.println("Square root is: " + result);
    }
}

*/

package BinarySearch;

public class Square_Root{

    public static int findSqrt(int n) {

        int low = 1;
        int high = n;

        int ans = 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square <= n) {

                ans = mid;
                low = mid + 1;
            }
            else {

                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = 28;

        int result = findSqrt(n);

        System.out.println("Square root is: " + result);
    }
}