package BinarySearch;

public class Search_Rotated_Array_Duplicates {

    public static boolean search(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (arr[mid] == target) {
                return true;
            }

            // Cannot determine sorted half due to duplicates
            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left++;
                right--;
                continue;
            }

            // Left half sorted
            if (arr[left] <= arr[mid]) {

                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Right half sorted
            else {

                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = {2,5,6,0,0,1,2};

        int target = 0;

        System.out.println(search(arr, target));
    }
}