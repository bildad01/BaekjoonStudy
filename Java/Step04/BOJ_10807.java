import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cut=0;
        int N = sc.nextInt();
        List <Integer> a = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            int s = sc.nextInt();
            a.add(s);
        }
        int v = sc.nextInt();
        for (int j=0;j<N;j++){
            if (a.get(j)==v){
                cut +=1;
            }
        }System.out.println(cut);
        sc.close();
    }
}