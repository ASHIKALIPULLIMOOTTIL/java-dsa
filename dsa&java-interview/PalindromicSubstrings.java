public class PalindromicSubstrings {
    public static void main(String[] args) {
        String s = "abba";
          System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);     // one center     //Odd:  (0), (1), (2), (3) → 4
            expand(s, i, i + 1); // two center     //Even: (0,1), (1,2), (2,3) → 3
        }
    }

    static void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            System.out.println(s.substring(left, right + 1));
            left--;        //expand from center
            right++;
        }
    }
}