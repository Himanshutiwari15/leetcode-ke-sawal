public class GuessNumber {
    public static void main(String[] args) {
        int n = 10;
        int pick = 6;

        System.out.println(guessNumber(n,pick));
    }
    static public int guessNumber(int n,int pick) {
        int start = 1;
        int end = n;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(mid == pick){
                return mid;
            } else if (mid < pick) {
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
}
