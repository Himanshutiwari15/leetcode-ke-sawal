public class LeetCodeFiveZero {
    public static void main(String[] args) {
        double x = 2.000;
        int n = -4;
        System.out.println(myPow(x,n));
    }
    static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n>0) {
            return x * myPow(x, n-1);
        }
        else{

            return 1/(x * myPow(x,(n*-1)-1));
        }
    }
}
