public class Reverse {
    public static void main(String ...args) {
        int n = 16261;
        int temp=n;
        int r, rev = 0;

        while (n != 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        System.out.println("Reversed number = " + rev);
        if(rev==temp){
            System.out.println("palindrome");
        }
    }
}