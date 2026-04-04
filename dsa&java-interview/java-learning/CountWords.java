public class CountWords {
    public static void main(String[] args) {
        String s="   dddd      abc  c er  rr ";
        String s2=s.replaceAll("\\s+"," ").trim();
        System.out.println(s2);
        String[] words=s2.split(" ");
        System.out.println(words[0]);
        System.out.println(words.length);
    }
}
//CountWords