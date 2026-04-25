import java.util.*;
public class Factors {
    public static void main(String[] args) {
        int n = 71;
        ArrayList<Integer> l=new ArrayList<>();
        int cnt=0;
        for (int i = 1; i <= Math.sqrt(n); i++) {   // same as i*i<= n
            if (n % i == 0) {
                l.add(i);
                cnt++;
                if (i != n / i) {
                    l.add(n/i);
                    cnt++;
                }
            }
        }
        Collections.sort(l);
        System.out.println("factors = "+l);
        if(cnt ==2){
            System.out.println("prime number");
        }
        //tc=O(√n log √n)
    }
}

/*
import java.util.*;

public class Factors {
    public static void main(String[] args) {
        int n = 36;

        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                small.add(i);

                if (i != n / i) {
                    large.add(n / i);
                }
            }
        }

        // Print in sorted order
        for (int x : small) {
            System.out.print(x + " ");
        }
       //print in reverse
        for (int i = large.size() - 1; i >= 0; i--) {
            System.out.print(large.get(i) + " ");
        }
            //Time Complexity: O(√n)
    }
}
*/