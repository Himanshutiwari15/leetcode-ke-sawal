import java.util.Arrays;

public class SortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    static String sortSentence(String s) {
        String[] words = s.split(" ");
//        System.out.println(Arrays.toString(words));
        String[] sortedWords = new String[words.length];
        for (String word : words) {
            int pos = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
//            System.out.println(pos);
            sortedWords[pos] = word.substring(0, word.length() - 1);
        }
//        System.out.println(Arrays.toString(sortedWords));
        return String.join(" ", sortedWords);
    }
}