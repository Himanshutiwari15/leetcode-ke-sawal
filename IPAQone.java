import java.util.Scanner;

public class IPAQone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            if((n%10)%2 !=0 ){
                count++;
            }
            n = n/10;
            if(count == 3){
                System.out.println(true);
                break;
            }
        }
        if (count < 3){
            System.out.println(false);
        }
    }
}