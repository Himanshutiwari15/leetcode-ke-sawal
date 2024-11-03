public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(firstBadVersion(n));
    }


    static int firstBadVersion(int n) {

        int start = 0;
        int end = n;

        while (start<end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    private static boolean isBadVersion(int mid) {
        int bad = 1;
        return mid == bad;
    }
}
