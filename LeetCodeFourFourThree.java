public class LeetCodeFourFourThree {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c'};
        System.out.println(compress(chars));
    }
    static int compress(char[] chars) {
        int write = 0;
        int read = 0;
        while (read< chars.length){
            char current = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = current;

            // If count > 1, write its digits
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        // Return the new length
        return write;
    }
}
