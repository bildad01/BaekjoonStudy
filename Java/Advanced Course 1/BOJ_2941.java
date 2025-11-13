import java.util.Scanner;

public class BOJ_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String[] li = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i<li.length; i++){
            A = A.replace(li[i], "*");
        }
        System.out.println(A.length());
        sc.close();

    }
    
}
