import java.util.Scanner;

public class BOJ_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P = sc.nextLine();
        String p = new StringBuilder(P).reverse().toString();

        if (P.equals(p)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        sc.close();
    }
    
}
