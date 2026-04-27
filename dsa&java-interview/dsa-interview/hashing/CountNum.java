package hashing;

//Using HashMap
import java.util.*;

public class CountNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

/*
//Using Array

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 1};

        // Step 1: Create frequency array
        int[] freq = new int[101]; // assuming values are from 0 to 100

        // Step 2: Count frequency
        for (int num : arr) {
            freq[num]++;
        }

        // Step 3: Print result
        System.out.println("Element -> Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}
//If your values are larger → ❌ this won’t work → use HashMap
*/