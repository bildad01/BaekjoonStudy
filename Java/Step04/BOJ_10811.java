import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int a = 1; a <= n; a++) {
            list.add(a);
        }

        for (int h = 0; h < m; h++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int I = i - 1;
            int J = j - 1;

            while (I < J) {
                int temp = list.get(I);
                list.set(I, list.get(J));
                list.set(J, temp);
                I++;
                J--;
            }
        }

        for (int f = 0; f < n; f++) {
            System.out.print(list.get(f) + " ");
        }
        sc.close();
    }
}
