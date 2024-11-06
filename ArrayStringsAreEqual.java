public class ArrayStringsAreEqual {
    public static void main(String[] args) {
        String [] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first = String.join("", word1);
        String second = String.join("",word2);
        return first.equals(second);
    }
}
