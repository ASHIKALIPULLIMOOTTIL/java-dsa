class test {
     // Recursive function using void
    public static void sum(int n,int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        
        sum(n-1,sum+n);
       
    }
}

class SumRecursion {
    public static void main(String[] args) {
        test.sum(5,0);
    }
}

/*

public class SumRecursion {
    
    // Recursive function using int
    public static int sum(int n) {
        if (n == 0) {   // base case
            return 0;
        }
        return n + sum(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum = " + result);
    }
}

*/