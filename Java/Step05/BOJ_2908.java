import java.util.Scanner;

public class BOJ_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int a=0, b = 0;

        while(i>0){
            a = a * 10 + i % 10;
            i /= 10;
        }
        while (j>0) {
            b =b * 10 + j % 10;
            j /= 10;
        }
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);

        }
        sc.close();
    }
    
}
