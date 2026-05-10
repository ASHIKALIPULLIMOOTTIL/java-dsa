package Sorting;
import java.util.*;

public class Selection {
   
    public static void main(String[] args) {
    
        int arr[] = {2, 4, 1, 6, 4};
        int l = arr.length;

        for(int i = 0; i < l - 1; i++) {  //i<l-1 => last element is already sorted
            int minIndex = i;

            for(int j = i + 1; j < l; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}