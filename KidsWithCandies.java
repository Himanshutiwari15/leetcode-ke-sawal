import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        ArrayList<Boolean> booleanList = new ArrayList<>();
        List<Boolean> booleanList = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int i =0; i < candies.length;++i){
            if(candies[i]+extraCandies >= max){
                booleanList.add(i,true);
            }
            else {
                booleanList.add(i,false);
            }
        }
        return booleanList;
    }
}
