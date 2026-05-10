package BinarySearch;

public class Nth_Root{

    public static int findrt(int n,int p) {

        int low = 1;
        int high = n;


        while (low <= high) {

            int mid = low + (high - low) / 2;

            long power = (long) Math.pow(mid, p);

            if(power==n){
               return mid;
            }
           else if (power < n) {

                low = mid + 1;
            }
            else {

                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 27;
        int p=3;

        int result = findrt(n,p);

        System.out.println(p +"th " + "root of "+ n +" is: " + result);
    }
}

/*

package BinarySearch;

public class Nth_Root {

    // Function to calculate mid^p
    public static long power(int mid, int p) {

        long ans = 1;

        for (int i = 1; i <= p; i++) {
            ans *= mid;
        }

        return ans;
    }

    public static int findrt(int n, int p) {

        int low = 1;
        int high = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long value = power(mid, p);

            if (value == n) {
                return mid;
            }

            else if (value < n) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 27;
        int p = 3;

        int result = findrt(n, p);

        System.out.println(p + "th root of " + n + " is: " + result);
    }
}   //TC=o(p*log n)
*/