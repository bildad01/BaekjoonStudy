import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List <Integer> score = new ArrayList<Integer>();
        for (int i=0; i<N; i++){
            int A = sc.nextInt();
            score.add(A);
        }
        int M = Collections.max(score);
        double num = 0;
        double total = 0;
        for(double i : score){
            num = i/M*100;
            total += num;
        }
        System.out.println(total/N);
        sc.close();
    }
    
}
