public class ReverseVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    static String reverseVowels(String s) {
        // Convert the string to a character array for easy swapping
        char[] chars = s.toCharArray();

        // Define two pointers
        int left = 0;
        int right = s.length() - 1;

        // Define a helper function to check if a character is a vowel
        while (left < right) {
            // Move left pointer until it points to a vowel
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            // Move right pointer until it points to a vowel
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // Swap the vowels at left and right pointers
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                // Move both pointers towards the center
                left++;
                right--;
            }
        }

        // Convert the character array back to a string and return it
        return new String(chars);
    }

    // Helper method to check if a character is a vowel
    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
