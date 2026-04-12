/*import java.util.*;

public class reverse_array {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(arr);

        Collections.reverse(list);

        System.out.println("Reversed array: " + list);
    }
}
*/

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        // Reverse in place
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/* in python
arr = [10, 20, 30, 40, 50]
arr.reverse()
print(arr)
*/

/*in c
#include <stdio.h>

void reverseArray(int arr[], int n) {
    int start = 0, end = n - 1;
    int temp;

    // Swap elements from both ends
    while (start < end) {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}

int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Original array: ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    reverseArray(arr, n);

    printf("\nReversed array: ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}
*/
