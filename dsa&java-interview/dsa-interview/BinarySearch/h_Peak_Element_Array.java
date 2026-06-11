package BinarySearch;

public class h_Peak_Element_Array {

    public static int peakElement(int arr[]) {

        int n = arr.length;

        // Only one element
        if (n == 1) {
            return arr[0];
        }

        // First element peak
        if (arr[0] > arr[1]) {
            return arr[0];
        }

        // Last element peak
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // if mid is the Peak
            if (arr[mid] > arr[mid - 1] &&
                arr[mid] > arr[mid + 1]) {

                return arr[mid];
            }

            // if mid is in Increasing slope =>eliminate left part
            else if (arr[mid] > arr[mid - 1]) {

                low = mid + 1;
            }

            //if mid is in Decreasing slope or mid is the pit=>eliminate right part 
            else {

                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,6,5};

        int result = peakElement(arr);

        System.out.println("Peak element is: " + result);
    }
}