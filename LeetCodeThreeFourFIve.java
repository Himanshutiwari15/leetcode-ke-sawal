import java.util.ArrayList;

public class LeetCodeThreeFourFIve {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
    static String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowels.add(ch);
            }
        }
        StringBuilder result = new StringBuilder(s);
        int j = vowels.size() -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                result.setCharAt(i, vowels.get(j));
                --j;
            }
        }
        return result.toString();
    }
}
