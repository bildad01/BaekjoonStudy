import java.util.Scanner;

public class BOJ_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<2*num; i++){
            int S = (i<=num) ? (2*i-1) : (2*(2*num -i)-1);
            int s = (i <= num) ? (num - i) : (i- num);
            System.out.println(" ".repeat(s) + "*".repeat(S));
        }
        sc.close();
    }
}