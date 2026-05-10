package BinarySearch;

public class Search_Rotated_Array1 {

    public static int findPivot(int arr[]) {

    int low = 0;
    int high = arr.length - 1;

    while (low < high) {  //stops when low==high

        int mid = low + (high - low) / 2;
        //The pivot always lies in the "unsorted" part.
        // Pivot is in right half
        if (arr[mid] > arr[high]) {

            low = mid + 1;
        }

        // Pivot is in left half including mid
        else {

            high = mid;
        }
    }

    return high; // pivot index
}

    public static int Search(int arr[], int t) {

        int n = arr.length;

        int left = 0, right = 0;

        // Find pivot
        left=findPivot(arr);
        right=left-1;

        right = n + right;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid % n] == t) {

                return mid % n;
            }

            else if (arr[mid % n] > t) {

                right = mid - 1;
            }

            else {

                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {6,7,8,9,1,2,3,4,5};

        int target = 4;

        int result = Search(arr, target);

        if (result != -1)

            System.out.println("Element found at index: " + result);

        else

            System.out.println("Element not found");
    }
}

/*
//for unique array
package BinarySearch;

public class Search_Rotated_Array1 {

    public static int Search(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            //find which half is sorted
            //then check the target in sorted part and if not elimate.
            //we can only check for target in sorted part

            // Left half sorted
            if (arr[left] <= arr[mid]) {
                // Check if target lies in left half
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }

            // Right half sorted
            else {
                // Check if target lies in right half
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {6,7,8,9,1,2,3,4,5};

        int target = 8;

        int result = Search(arr, target);

        System.out.println(result);
    }
}

*/