public class LeetCodeOneZeroSevenOne {
    public static void main(String[] args) {
        String str1 = "ABABAB", str2 = "ABAB";
        System.out.println(gcdOfStrings(str1,str2));
    }
    static private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdlen = gcd(str1.length(),str2.length());
        return str1.substring(0, gcdlen);

    }
}
