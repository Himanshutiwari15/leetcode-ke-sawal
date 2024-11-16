public class LeetCodeEight {
    public static void main(String[] args) {
        String s =" -042";
        System.out.println(myAtoi(s));
    }
    static int myAtoi(String s) {
        // Step 1: Handle leading whitespace
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Read digits
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Step 4: Handle overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        // Step 5: Apply the sign
        return result * sign;
    }
}
