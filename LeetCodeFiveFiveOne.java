public class LeetCodeFiveFiveOne {
    public static void main(String[] args) {
        String s = "PPALLP";
        System.out.println(checkRecord(s));
    }
    static boolean checkRecord(String s) {
        int absentcounter = 0;
        int lateStreak=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A'){
                absentcounter++;
                if (absentcounter==2){
                    return false;
                }
            }
            if (s.charAt(i) == 'L') {
                lateStreak++;
                if (lateStreak == 3) {
                    return false;
                }
            } else {
                lateStreak = 0;  // Reset the streak if the character is not 'L'
            }
        }
        return true;
    }
}
