package Array;


public class FindMajority {
     //Moore’s Voting Algorithm is used to find the majority element in an array — an element that appears more than n/2 times.
    // Function to find majority element
    public static int findMajority(int[] arr) {
        int candidate = 0, count = 0;

        // Step 1: Find candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        //here the candidate in which the count is not cancelled=>majority element
        // Step 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
         System.out.println(count);
        if (count > arr.length / 2) {
            return candidate;
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int result = findMajority(arr);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element");
        }
    }
}