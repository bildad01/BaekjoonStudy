import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1;i<N+1;i++){
            System.out.printf("%" + N + "s\n","*".repeat(i));
        }sc.close();
    }
    
}
