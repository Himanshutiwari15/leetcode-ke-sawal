import java.util.Arrays;

public class LeetCodeFourNineTwo {
    public static void main(String[] args) {
        int area = 4;
        System.out.println(Arrays.toString(constructRectangle(area)));
    }
    static int[] constructRectangle(int area) {
        return findLW((int) Math.sqrt(area),area);
    }

    private static int[] findLW(int sqrty,int area) {
        if(area % sqrty == 0 ){
            return new int[]{area/sqrty, sqrty};
        }
        return findLW(sqrty-1,area);
    }
}
