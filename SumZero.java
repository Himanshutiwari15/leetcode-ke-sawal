import java.util.Arrays;

class SumZero{
    public static void main(String[] args) {
        int n = 0;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    static int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n % 2 == 0){
            for(int i = 0, k = n/2;i<n/2;++i,++k){
                arr[i]= i+1;
                arr[k]= - arr[i];
            }
        }
        else{
            arr[n/2] = 0;
            for(int i = 0, k = n/2 + 1;i<n/2;++i,++k){
                arr[i]= i+1;
                arr[k]= - arr[i];
            }
        }
        return arr;
    }
}