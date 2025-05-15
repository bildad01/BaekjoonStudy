//오븐 시계
import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        h += (a / 60);
        m += (a % 60);

        if (m >= 60){
            h += 1;
            m -= 60;
        }
        if (h >= 24){
            h -= 24;
        }
        System.out.printf("%d %d\n",h, m);
        sc.close();
    }
    
}
