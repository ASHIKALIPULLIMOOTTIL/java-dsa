/* 
package BinarySearch;

public class Min_Rotated_Array1 {

    public static int min(int arr[]) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;
           
            //eliminate the sorted part
            if (arr[mid] > arr[right]) {
                left=mid+1; //eliminate left sorted part
            }
            else{
                right=mid;  //sorted part in right may contain min
            }

        }

        return arr[left];
    }

    public static void main(String[] args) {

        int arr[] = {6,7,8,9,4};

        int result = min(arr);

        System.out.println(result);
    }
}

*/

package BinarySearch;

public class f_Min_Rotated_Array {

    public static int findMin(int arr[]) {

        int low = 0;
        int high = arr.length - 1;

        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Left half is sorted
            if (arr[low] <= arr[mid]) {

                ans = Math.min(ans, arr[low]);

                // Eliminate left half
                low = mid + 1;
            }

            // Right half is sorted
            else {

                ans = Math.min(ans, arr[mid]);

                // Eliminate right half
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {4,5,6,7,1,2};

        int result = findMin(arr);

        System.out.println("Minimum element: " + result);
    }
}

