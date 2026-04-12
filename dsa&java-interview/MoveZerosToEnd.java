public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        moveZeros(arr);

        // Print the updated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void moveZeros(int[] arr) {
        int j = 0; // index to place the next non-zero element

        // Step 1: Move all non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }
}

