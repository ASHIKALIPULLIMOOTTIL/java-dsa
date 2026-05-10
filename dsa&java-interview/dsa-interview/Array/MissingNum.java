/* 
package Array;

public class MissingNum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 7, 9};
        int l = arr.length;
        int n = arr[l - 1];

        for (int i = 1; i <= n; i++) {
            int flag = 0;

            for (int j = 0; j < l; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(i);
            }
        }
    }
}
*/
/*
package Array;

public class MissingNum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 7, 9};
        int l = arr.length;
        int n = arr[l - 1];  // max value

        int hash[] = new int[n + 1];

        // Mark present elements
        for (int i = 0; i < l; i++) {
            hash[arr[i]] = 1;
        }

        // Find missing numbers
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
*/

package Array;

public class MissingNum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5}; // missing 3
        int n = 5;

        int xor1 = 0; // XOR from 1 to n
        int xor2 = 0; // XOR of array

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }
        // XOR all elements of array
        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
        }

        int missing = xor1 ^ xor2;

        System.out.println("Missing number: " + missing);
    }
}

/*
x ⊕ x = 0 (same numbers cancel)
x ⊕ 0 = x
⚠️ Important
This works only when one number is missing.
we can also use sum trick for missing one number
*/