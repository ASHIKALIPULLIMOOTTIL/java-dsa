package Array;

import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] A) {
        int n = A.length;
        int ind = -1;

        // Step 1: Find the breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no breakpoint, reverse entire array
        if (ind == -1) {
            reverse(A, 0, n - 1);
            return;
        }

        // Step 3: Find next greater element and swap
        for (int i = n - 1; i > ind; i--) {
            if (A[i] > A[ind]) {
                swap(A, i, ind);
                break;
            }
        }

        // Step 4: Reverse the right half
        reverse(A, ind + 1, n - 1);
    }

    // Swap function
    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Reverse function
    public static void reverse(int[] A, int start, int end) {
        while (start < end) {
            swap(A, start, end);
            start++;
            end--;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};

        nextPermutation(arr);
       

        System.out.println(Arrays.toString(arr));
    }
}

/*
to find Next Greater Permutation:
🔑 Key Idea:
Find the first decreasing element from right
Swap it with the next greater element
Reverse the remaining suffix

*/