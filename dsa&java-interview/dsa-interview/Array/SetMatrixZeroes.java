package Array;

public class SetMatrixZeroes {

    public static void markRow(int[][] arr, int i) {
        int m = arr[0].length;
        for (int j = 0; j < m; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1; // mark
            }
        }
    }

    public static void markCol(int[][] arr, int j) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1; // mark
            }
        }
    }

    public static void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        // Step 1: Mark rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, i);
                    markCol(arr, j);
                }
            }
        }

        // Step 2: Convert all -1 to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(arr);

        printMatrix(arr);
    }
}

/*

import java.util.*;

public class Main {

    public static void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[] row = new int[n]; // row markers
        int[] col = new int[m]; // column markers

        // Step 1: Mark rows & columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Step 2: Set elements to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(arr);
        printMatrix(arr);
    }
}


*/

/*

import java.util.*;

public class Main {

    public static void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int col0 = 1;

        // Step 1: Mark rows & cols
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) col0 = 0;

            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;   // mark row
                    arr[0][j] = 0;   // mark col
                }
            }
        }

        // Step 2: Fill matrix (bottom-up)
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 1; j--) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }

            if (col0 == 0) {
                arr[i][0] = 0;
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(arr);
        printMatrix(arr);
    }
}


*/