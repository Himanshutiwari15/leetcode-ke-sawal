import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s) {
        // Initialize a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the string
        for (char ch : s.toCharArray()) {
            // Push any opening bracket onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If the stack is empty, there is no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                // Check the top of the stack
                char top = stack.pop();

                // Ensure the closing bracket matches the most recent opening bracket
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
