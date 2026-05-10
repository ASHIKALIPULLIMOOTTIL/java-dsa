package Array;

public class UnionTwoArrays {
    public static void main(String[] args) {

        int a[] = {1, 2, 2, 3, 4};
        int b[] = {2, 3, 5, 6};

        int n = a.length;
        int m = b.length;

        int i = 0, j = 0;

        System.out.println("Union of arrays:");

        while(i < n && j < m){

            // skip duplicates in array a
            if(i > 0 && a[i] == a[i - 1]){
                i++;
                continue;
            }

            // skip duplicates in array b
            if(j > 0 && b[j] == b[j - 1]){
                j++;
                continue;
            }

            if(a[i] < b[j]){
                System.out.print(a[i] + " ");
                i++;
            }
            else if(a[i] > b[j]){
                System.out.print(b[j] + " ");
                j++;
            }
            else{
                // both equal → print once
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }

        // remaining elements of a[]
        while(i < n){
            if(i == 0 || a[i] != a[i - 1]){
                System.out.print(a[i] + " ");
            }
            i++;
        }

        // remaining elements of b[]
        while(j < m){
            if(j == 0 || b[j] != b[j - 1]){
                System.out.print(b[j] + " ");
            }
            j++;
        }
    }
}

/*

package Array;
import java.util.*;

public class UnionTwoArrays {
    public static void main(String[] args) {

        int a[] = {1, 2, 2, 3, 4};
        int b[] = {2, 3, 5, 6};

        int n1 = a.length;
        int n2 = b.length;

        int i = 0, j = 0;

        ArrayList<Integer> unionArr = new ArrayList<>();

        // main loop
        while(i < n1 && j < n2){

            if(a[i] <= b[j]){
                if(unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != a[i]){
                    unionArr.add(a[i]);
                }
                i++;
            } else {
                if(unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != b[j]){
                    unionArr.add(b[j]);
                }
                j++;
            }
        }

        // remaining elements of a[]
        while(i < n1){
            if(unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != a[i]){
                unionArr.add(a[i]);
            }
            i++;
        }

        // remaining elements of b[]
        while(j < n2){
            if(unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != b[j]){
                unionArr.add(b[j]);
            }
            j++;
        }

        // print result
        System.out.println("Union of arrays:");
        for(int val : unionArr){
            System.out.print(val + " ");
        }
    }
}

*/