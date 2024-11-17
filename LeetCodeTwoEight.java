public class LeetCodeTwoEight {
    public static void main(String[] args) {

    }
    static int strStr(String haystack, String needle) {
//        int index = haystack.indexOf(needle);
//        return index;
        int m = haystack.length();
        int n = needle.length();

        // Step 1: Edge case - if needle is empty, return 0
        if (n == 0) {
            return 0;
        }

        // Step 2: Traverse haystack using a sliding window
        for (int i = 0; i <= m - n; i++) {
            // Check if the current substring matches the needle
            if (haystack.substring(i, i + n).equals(needle)) {
                return i; // Match found
            }
        }

        // Step 3: If no match is found, return -1
        return -1;

    }
}
