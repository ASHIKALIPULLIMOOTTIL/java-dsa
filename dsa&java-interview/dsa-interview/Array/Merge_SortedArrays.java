package Array;

import java.util.*;

public class Merge_SortedArrays {

    public static void merge(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] temp = new int[n + m];

        int left = 0;
        int right = 0;
        int k = 0;

        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                temp[k++] = arr1[left++];
            } else {
                temp[k++] = arr2[right++];
            }
        }

        while (left < n) {
            temp[k++] = arr1[left++];
        }

        while (right < m) {
            temp[k++] = arr2[right++];
        }

        for (int i = 0; i < n; i++) {
            arr1[i] = temp[i];
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = temp[n + i];
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}

/*
import java.util.*;

public class Main {

    public static void merge(int[] arr1, int[] arr2) {

        int left = arr1.length - 1;
        int right = 0;

        while (left >= 0 && right < arr2.length) {

            if (arr1[left] > arr2[right]) {

                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;

                left--;
                right++;
            } else {
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
*/

/*
import java.util.Arrays;
public class Main {
    private static void swapIfGreater(long[] arr1, long[] arr2,
                                      int ind1, int ind2) {

        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    public static void merge(long[] arr1, long[] arr2, int n, int m) {
        int len = n + m;
        int gap = (len / 2) + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                // arr1 and arr2
                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2,
                                  left, right - n);
                }
                // arr2 and arr2
                else if (left >= n) {
                    swapIfGreater(arr2, arr2,
                                  left - n, right - n);
                }
                // arr1 and arr1
                else {
                    swapIfGreater(arr1, arr1,
                                  left, right);
                }
                left++;
                right++;
            }
            if (gap == 1) {
                break;
            }
            gap = (gap / 2) + (gap % 2); //if we get 1 here=>run for once and break.otherwise it will keep giving 1.
        }
    }
    public static void main(String[] args) {
        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("Array 1: "
                + Arrays.toString(arr1));
        System.out.println("Array 2: "
                + Arrays.toString(arr2));
    }
}
*/