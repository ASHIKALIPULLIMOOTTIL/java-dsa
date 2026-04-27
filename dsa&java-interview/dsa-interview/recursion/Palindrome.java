class Palindrome {
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;

        if (str.charAt(left) != str.charAt(right)) return false;

        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}