package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 4};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                // swap
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--; // important    
            }
        }

        System.out.println(Arrays.toString(arr));
         //bestcase(o(n)) without didswap(like in buublesort)
    }
}

/*

package Sorting;

import java.util.Arrays;

       //best no swapping,shifting

public class Insertion {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 6, 4};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];   // element to insert
            int j = i - 1;

            // shift elements to right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place key at correct position
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}

*/