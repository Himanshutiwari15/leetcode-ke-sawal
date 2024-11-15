import java.util.Arrays;

public class LeetCodeOneFiveOne {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        s= s.trim();
        String[] arr = s.split("\\s+");
        int left=0;
        int right = arr.length-1;
        while (left<right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            ++left;
            --right;
        }

        return String.join(" ", arr);
    }
}
