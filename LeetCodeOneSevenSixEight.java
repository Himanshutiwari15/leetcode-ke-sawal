import java.util.Arrays;

public class LeetCodeOneSevenSixEight {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
    static String mergeAlternately(String word1, String word2) {
        String[] MergedWord = new String[word1.length()+word2.length()];
        int i=0,j=0,k=0;
        while (i<word1.length() && j<word2.length()){
            MergedWord[k] = String.valueOf(word1.charAt(i));
            ++k;
            ++i;
            MergedWord[k] = String.valueOf(word2.charAt(j));
            ++k;
            ++j;
        }
        if(i < word1.length()){
            while (i < word1.length()) {
                MergedWord[k] = String.valueOf(word1.charAt(i));
                ++k;
                ++i;
            }
        }else {
            while (j < word2.length()) {
                MergedWord[k] = String.valueOf(word2.charAt(j));
                ++k;
                ++j;
            }
        }

        return String.join("", MergedWord);
    }
}
