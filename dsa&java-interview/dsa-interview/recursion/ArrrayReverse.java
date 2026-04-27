import java.util.Arrays;

class ArrayReverse {
    public static void rev(int arr[], int l, int r) {
        if (l >= r) return;

        // swap directly in array
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        rev(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,5};

        rev(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
