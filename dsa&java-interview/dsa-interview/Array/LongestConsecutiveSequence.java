package Array;

public class LongestConsecutiveSequence {

    // Linear search helper
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static int longestConsecutive(int[] arr) {
        int n = arr.length;
        int longest = 1;

        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;

            // keep checking next consecutive numbers
            while (linearSearch(arr, x + 1)) {
                x++;
                count++;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutive(arr));
    }
}

/*

import java.util.*;

public class Main {

    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        Arrays.sort(arr);

        int longest = 1;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                continue; // skip duplicates
            } 
            else if (arr[i] == arr[i - 1] + 1) {
                count++;
            } 
            else {
                count = 1;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutive(arr));
    }
}

*/

/*

import java.util.*;

public class Main {

    public static int longestConsecutive(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        // add all elements
        for (int num : arr) {
            set.add(num);
        }

        int longest = 1;

        for (int num : set) {

            // start only if it's the beginning of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutive(arr));
    }
}

*/
/*
👉 Idea:

Put all elements in a HashSet
Start only from numbers where (num - 1) is NOT present
Build sequence forward
*/