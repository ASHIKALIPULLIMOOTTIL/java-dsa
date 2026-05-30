package Array;

public class CountSubarrays {
    public static int countSubarrays(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
             int sum = 0;
            for (int j = i; j < n; j++) {

               sum += arr[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;

        System.out.println(countSubarrays(arr, k));
    }
}

/*
import java.util.HashMap;

public class Main {

    public static int countSubarrays(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : arr) {

            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1};
        int k = 2;

        System.out.println(countSubarrays(arr, k));
    }
}
*/