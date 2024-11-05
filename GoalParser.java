public class GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }
    static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G'){
                sb.append('G');
            } else if (command.charAt(i)=='(' && command.charAt(i+1) ==')') {
                sb.append('o');
                i = i+1;
            } else if (command.charAt(i)=='(' && command.charAt(i+1) =='a') {
                sb.append("al");
                i = i+2;
            }
        }
        return new String(sb);
    }
}
