import java.util.Scanner;

public class BOJ_2563 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] paper = new int[100][100];

        for (int k = 0; k < n; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int i = x; i < x +10; i++) {
                for (int j = y; j < y+10; j++) {
                    paper[i][j] =1;
                }
            }

        }
        int answer = 0;
        for (int i =0; i<100; i++){
            for (int j=0; j<100; j++){
                answer += paper[i][j];
            }
        }
        System.out.println(answer);
        sc.close();
    }
}