public class LeetCodeOneNineTwoTwo  {

    private static long MOD = 1_000_000_007;

    public static void main(String[] args) {
        long n = 4;
        System.out.println(countGoodNumbers(4));
    }
    static int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long first = (myPow(5,even)%MOD);
        long second = myPow(4,odd)%MOD;
        return (int) ((first*second)%MOD);
    }

    static long myPow(long x, long n) {
        if(n==0) return 1;
        long temp = myPow(x,n/2);
        if(n%2==0){
            return (temp*temp)%MOD;
        }
        else {
            return (x*temp*temp)%MOD;
        }
    }
}
