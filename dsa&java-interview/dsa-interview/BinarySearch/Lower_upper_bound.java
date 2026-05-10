package BinarySearch;

public class Lower_upper_bound {
    
    public static int lowerBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n; // default: if no element >= x

        while (low <= high) {
            int mid = low + (high - low) / 2; //avoid overflow

            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;       // store possible answer
                high = mid - 1;  // look on left side for smaller index
            } else {
                low = mid + 1;   // go right
            }
        }
        return ans;
    }

    public static int floor(int[] arr, int n, int x) {
    int low = 0, high = n - 1;
    int ans = -1; // default if no floor exists

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] <= x) {
            ans = arr[mid];   // possible floor
            low = mid + 1;    // try to find bigger on the rigth side
        } else {
            high = mid - 1;
        }
    }
    return ans;
}

public static int ceil(int[] arr, int n, int x) {
    int low = 0, high = n - 1;
    int ans = -1; // default if no ceil exists

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] >= x) {
            ans = arr[mid];   // possible ceil
            high = mid - 1;   // try to find smaller one on the left
        } else {
            low = mid + 1;
        }
    }
    return ans;
}

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 9, 9,9,9};
        int n = arr.length;

        System.out.println(lowerBound(arr, n, 2)); // 1
        System.out.println(lowerBound(arr, n, 4)); // 5
        System.out.println(lowerBound(arr, n, 10)); // 6 (n)

        System.out.println(floor(arr, n, 3));
        System.out.println(ceil(arr, n, 3));
    }
}

/*

public class Lower_upper_bound {

    public static int upperBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n; // default: if no element > x

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;       // store possible answer
                high = mid - 1;  // look on left for smaller index
            } else {
                low = mid + 1;   // go right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 5};
        int n = arr.length;

        System.out.println(upperBound(arr, n, 2)); // 4
        System.out.println(upperBound(arr, n, 5)); // 6
        System.out.println(upperBound(arr, n, 0)); // 0
    }
    
}

*/