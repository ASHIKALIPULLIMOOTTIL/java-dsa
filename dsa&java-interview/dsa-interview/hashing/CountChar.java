package hashing;

public class CountChar {
    public static void main(String[] args) {

        String str = "aabccdaA";
        str=str.toLowerCase();

        // Step 1: Create frequency array for 26 alphabets
        int[] freq = new int[26];

        // Step 2: Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        // Step 3: Print result
        System.out.println("Alphabet -> Frequency");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char)(i + 'a');
                System.out.println(ch + " -> " + freq[i]);
            }
        }
    }
}
/*

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String str = "aabccda";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            System.out.println(ch + " -> " + map.get(ch));
        }
    }
}

*/