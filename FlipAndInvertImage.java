import java.util.Arrays;

//import static java.util.Collections.swap;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

    }
    static int[][] flipAndInvertImage(int[][] image) {
//        int temp = 0;
        for (int i = 0; i < image.length;++i){
//            temp = 0;
            for (int j =0; j< ((image[i].length+1)/2);++j){
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length-1-j];
                image[i][image[i].length-1-j] = temp;
            }
        }

        for (int i =0; i<image.length;++i){
            for(int j =0;j<image[i].length;++j){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }else {
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}
