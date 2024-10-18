import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        // Traverse the array from the last digit to the first
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Otherwise, set the current digit to 0 and continue to the next digit
            digits[i] = 0;
        }

        // If we're here, all the digits were 9, so we need an extra digit at the beginning
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
