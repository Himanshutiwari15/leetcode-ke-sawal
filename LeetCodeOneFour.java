public class LeetCodeOneFour {
    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // No common prefix if the array is empty
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare the prefix with each subsequent string
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the start of the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, there's no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
