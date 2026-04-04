public class DisplayInWords {
    public static void main(String[] args) {
        int n = 20800;

        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        String numStr = String.valueOf(n);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0'; //converts char to int(eg:7-> 55-48=7)
            System.out.print(words[digit] + " ");
        }
    }
}//DisplayInWords