
import java.util.*;

public class LeftRotate {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int l = a.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shift number:");
        int d = sc.nextInt();

        d = d % l;
        int temp[] = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = a[i];
        }
        for(int i = d; i < l; i++){
            a[i - d] = a[i];
        }

        for(int i = 0; i < d; i++){
            a[l - d + i] = temp[i];
        }

        for(int i = 0; i < l; i++){
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
