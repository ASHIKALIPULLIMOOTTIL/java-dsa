class test {
    public static void nt(int n){
        if(n == 0){
            return;
        }
        
        nt(n - 1);   // go deeper first
        System.out.println(n); // print while returning (backtracking)
    }
}

class BackTrack {
    public static void main(String[] args) {
        test.nt(5);
    }
}
