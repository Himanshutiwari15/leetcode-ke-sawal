public class LargestAltitude {
    public static void main(String[] args) {
        int[] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int largest = Integer.MIN_VALUE;
        int start = 0;
        int[] distance = new int[gain.length + 1];
        distance[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            distance[i+1] = distance[i] + gain[i];
            if(distance[i] > largest){
                largest = distance[i];
            }
        }
        if(distance[gain.length]>largest){
            largest = distance[gain.length];
        }
        return largest;
    }
}
