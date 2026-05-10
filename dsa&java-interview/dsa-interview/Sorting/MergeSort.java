package Sorting;

class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        // Merge both halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                k++;
                left++;
            } else {
                temp[k] = arr[right];
                k++;
                right++;
            }
        }

        // Remaining elements from left half
        while (left <= mid) {
            temp[k] = arr[left];
            k++;
            left++;
        }

        // Remaining elements from right half
        while (right <= high) {
            temp[k] = arr[right];
            k++;
            right++;
        }

        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
             }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3,-1,0};

        mergeSort( arr, 0, arr.length - 1);


        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}