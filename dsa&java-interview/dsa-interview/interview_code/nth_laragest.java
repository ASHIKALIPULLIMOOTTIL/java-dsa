public class nth_laragest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        int n = arr.length;

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("third alrgest element:"+ arr[arr.length - 3]);
    }
}

/*
import java.util.Arrays;

public class SecondLargestSort {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 45, 12};

        Arrays.sort(arr); // sort in ascending order

        System.out.println("Second largest element: " + arr[arr.length - 2]);
    }
}
*/
