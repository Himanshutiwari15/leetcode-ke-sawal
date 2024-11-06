public class FreqAlphabets {
    public static void main(String[] args) {
        String s ="10#11#12";
        System.out.println(freqAlphabets(s));
    }
    static String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length();) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                result.append((char) ('a' + num - 1));
                i += 3;
            } else {
                int num = s.charAt(i) - '0';
                result.append((char) ('a' + num - 1));
                i++;
            }
        }
        return result.toString();
    }
}
