public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));  // Output: true
    }

    static boolean isPalindrome(String s) {
        // Step 1: Convert the string to lowercase
        String lowerCaseString = s.toLowerCase();

        // Step 2: Filter out non-alphanumeric characters
        StringBuilder filteredString = new StringBuilder();
        for (char c : lowerCaseString.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(c);
            }
        }

        s = filteredString.toString();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;  // Characters don't match, so it's not a palindrome
            }
            left++;
            right--;
        }

        return true;
    }
}
