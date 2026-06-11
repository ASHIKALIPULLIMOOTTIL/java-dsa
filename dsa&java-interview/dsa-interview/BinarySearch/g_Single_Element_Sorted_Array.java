package BinarySearch;

public class g_Single_Element_Sorted_Array {

    public static int singleNonDuplicate(int arr[]) {

        int n = arr.length;

        // If only one element
        if (n == 1) {
            return arr[0];
        }

        // Check first element
        if (arr[0] != arr[1]) {
            return arr[0];
        }

        // Check last element
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Element found
            if (arr[mid] != arr[mid - 1] &&
                arr[mid] != arr[mid + 1]) {

                return arr[mid];
            }

            // We are on left side((even,odd))
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {

                low = mid + 1; //eliminate left side
            }

            // We are on right side((odd,even))
            else {
                high = mid - 1; //eliminate right side
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3,4,4,5,5};

        int result = singleNonDuplicate(arr);

        System.out.println("Single element is: " + result);
    }
}