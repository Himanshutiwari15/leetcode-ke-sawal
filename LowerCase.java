public class LowerCase {
    public static void main(String[] args) {
        String s = "LOVE";
        StringBuilder result = new StringBuilder();
//        System.out.println(s.toLowerCase());
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            if(ch >= 65 && ch <= 90){
                result.append((char) (ch + 32));
            }else{
                result.append(s.charAt(i));
            }
        }
        s = result.toString();
        System.out.println(s);
    }
}
