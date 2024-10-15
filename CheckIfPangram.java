public class CheckIfPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean[] presentornot = new boolean[26];
        for (int i = 0; i < presentornot.length; i++) {
            presentornot[i] = false;
        }

        for(int i=0; i< sentence.length();++i){
            for (int j=0; j < 26; ++j ){
                if(sentence.charAt(i) == alphabets[j]){
                    presentornot[j] = true;
                    break;
                }
            }
        }
        for (int i=0; i<26; ++i){
            if(presentornot[i] == false){
                return false;
            }
        }
        return true;
    }
}
