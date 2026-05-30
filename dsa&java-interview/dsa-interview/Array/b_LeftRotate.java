package Array;
import java.util.*;

public class b_LeftRotate {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int l = a.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shift number:");
        int d = sc.nextInt();

        d = d % l; // important if d > length

        // Step 1: store first d elements
        int temp[] = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = a[i];
        }

        // Step 2: shift remaining elements left
        for(int i = d; i < l; i++){
            a[i - d] = a[i];
        }

        // Step 3: put temp elements at end
        for(int i = 0; i < d; i++){
            a[l - d + i] = temp[i];
        }

        // print result
        for(int i = 0; i < l; i++){
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}

/*
//most optimal by reversing(reduce space complexity->0(1))

package Array;
import java.util.*;

public class LeftRotate {

    // reverse function
    static void reverse(int a[], int start, int end){
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shift (d): ");
        int d = sc.nextInt();

        d = d % n; // handle d > n

        // Step 1: reverse first d elements
        reverse(a, 0, d - 1);

        // Step 2: reverse remaining elements
        reverse(a, d, n - 1);

        // Step 3: reverse whole array
        reverse(a, 0, n - 1);

        // print result
        System.out.println("Array after left rotation:");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}


*/