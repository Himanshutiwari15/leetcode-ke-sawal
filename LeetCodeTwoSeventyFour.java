import java.util.Arrays;

public class LeetCodeTwoSeventyFour {
    public static void main(String[] args) {
        int[] citations ={3,0,6,1,5};
        System.out.println(hIndex(citations));
    }
    static int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if(citations[i] >= (citations.length - citations[i]) ){
                return citations.length - citations[i];
            }
        }
        return 0;
    }
}
