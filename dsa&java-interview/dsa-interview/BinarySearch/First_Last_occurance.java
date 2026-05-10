package BinarySearch;

public class First_Last_occurance {

    public static int First(int arr[], int n, int t) {
        int left = 0, right = n - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == t) {
                ans = mid;
                right = mid - 1; // search on left side
            }
            else if (arr[mid] < t) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static int Last(int arr[], int n, int t) {
        int left = 0, right = n - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == t) {
                ans = mid;
                left = mid + 1; // search on right side
            }
            else if (arr[mid] < t) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 7, 9, 9, 9, 9, 9};

        int n = arr.length;

        int target = 9;

        int result1 = First(arr, n, target);

        System.out.println("first occurrence of " + target + " = " + result1);

        int result2 = Last(arr, n, target);

        System.out.println("last occurrence of " + target + " = " + result2);
    }
}