//import static com.sun.tools.javac.jvm.ByteCodes.swap;
//import static java.util.Collections.swap;

public class LeetCodeThreeFourFour {
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        reverseString(s);

    }
    static void reverseString(char[] s) {
        reverseS(s, 0, s.length - 1);
    }

    private static void reverseS(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        swap(s, left, right);
        reverseS(s, left + 1, right - 1);
    }

    private static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
