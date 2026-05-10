package Array;
import java.util.*;

public class IntersectionTwoArray {
    public static void main(String[] args) {

        int a[] = {1, 2, 2, 3, 4};
        int b[] = {2, 2, 3, 5, 6};

        int i = 0, j = 0;
        int n1 = a.length, n2 = b.length;

        ArrayList<Integer> result = new ArrayList<>();

        while(i < n1 && j < n2){

            if(a[i] < b[j]){
                i++;
            }
            else if(a[i] > b[j]){
                j++;
            }
            else{
                // avoid duplicates
                if(result.size() == 0 || result.get(result.size()-1) != a[i]){
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }

        System.out.println("Intersection:");
        for(int x : result){
            System.out.print(x + " ");
        }
    }
}

/*
//using set
package Array;
import java.util.*;

public class IntersectionSet {
    public static void main(String[] args) {

        int a[] = {1,2,2,3,4};
        int b[] = {2,2,3,5};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int x : a){
            set1.add(x);
        }

        for(int x : b){
            if(set1.contains(x)){
                result.add(x);
            }
        }

        System.out.println(result);
    }
}

*/