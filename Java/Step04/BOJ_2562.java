import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int pos = 0;
        for (int i=0;i<9;i++){
            int a = sc.nextInt();
            if (a>N){
                N = a;
                pos = i+1;
            }
        }
        System.out.println(N);
        System.out.println(pos);
        sc.close();
        }
    }