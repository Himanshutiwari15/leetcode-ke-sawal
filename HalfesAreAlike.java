import java.util.HashSet;
import java.util.Set;

public class HalfesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
//        int countleft = 0;
//        int countright = 0;
//        for (int i = 0; i < s.length()/2; i++) {
//            char ch = s.charAt(i);
//            if(ch =='a' || ch== 'e' || ch=='i' || ch== 'o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//                countleft++;
//            }
//        }
//        for (int i = s.length()/2; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(ch =='a' || ch== 'e' || ch=='i' || ch== 'o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//                countright++;
//            }
//        }
//        return countleft==countright;

        // Set of vowels for quick lookup
        Set<Character> vowels = new HashSet<>();
        for (char ch : "aeiouAEIOU".toCharArray()) {
            vowels.add(ch);
        }

        int count = 0;
        int n = s.length();

        // Use two pointers to compare halves in a single loop
        for (int i = 0; i < n / 2; i++) {
            // Check if character in the left half is a vowel
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
            // Check if character in the right half is a vowel
            if (vowels.contains(s.charAt(n - 1 - i))) {
                count--;
            }
        }

        // If count is zero, both halves have an equal number of vowels
        return count == 0;

    }
}
