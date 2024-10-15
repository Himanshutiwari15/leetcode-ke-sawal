import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatches {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList("phone","blue","pixel"),
                        Arrays.asList("computer","silver","lenovo"),
                        Arrays.asList("phone","gold","iphone")
                )
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            List<String> sublist = items.get(i);
            for (int j = 0; j < sublist.size(); j++) {
                if((ruleKey == "type") && (sublist.get(j) == ruleValue)) {
                    System.out.println(sublist.get(j));
                } else if ((ruleKey == "color") && (sublist.get(j) == ruleValue)) {
                    
                }
            }
        }
        return count;
    }
}
