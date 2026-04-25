// Java program to generate all binary strings from a pattern using Queue
import java.util.*;

public class all_binary_from_pattern {

    // Function to generate all combinations
    static void generateBinaryStrings(String pattern) {
        Queue<String> queue = new LinkedList<>();
        queue.add(pattern); // Start with the original pattern

        while (!queue.isEmpty()) {
            String current = queue.poll();

            // Find the first '?' in the current string
            int index = current.indexOf('?');

            // If no '?' found, print the string (it's complete)
            if (index == -1) {
                System.out.println(current);
            } else {
                // Replace '?' with '0' and '1' and enqueue both
                String str0 = current.substring(0, index) + '0' + current.substring(index + 1);
                String str1 = current.substring(0, index) + '1' + current.substring(index + 1);

                queue.add(str0);
                queue.add(str1);
            }
        }
    }

    public static void main(String[] args) {
        String pattern = "1?0?";
        System.out.println("All possible binary strings:");
        generateBinaryStrings(pattern);
    }
}

