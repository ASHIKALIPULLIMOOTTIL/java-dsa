import java.util.Arrays;
import java.util.Collections;

public class ReverseOrderSorting {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "mango", "cherry"};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}