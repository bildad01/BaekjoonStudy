import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for (int i =0; i<28; i++) {
            int n = sc.nextInt();
            list.add(n);
        }

        for (int a = 1; a < 31; a++) {
            if (!list.contains(a)){
                System.out.println(a);
            }
        }

        sc.close();
    }
}
