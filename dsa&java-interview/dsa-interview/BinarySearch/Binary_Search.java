package BinarySearch;

class Binary_Search {
    public static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2; 

            if (arr[mid] == target) {
                return mid; // element found
            } 
            else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } 
            else {
                right = mid - 1; // search left half
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38};
        int target = 16;

        int result = binarySearch(arr, target);   //TC=O(log n)

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}

/*

class Main {
    public static int binarySearch(int arr[], int left, int right, int target) {
        if (left > right) {
            return -1; // base case: not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // found
        } 
        else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target);
        } 
        else {
            return binarySearch(arr, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38};
        int target = 16;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}

*/