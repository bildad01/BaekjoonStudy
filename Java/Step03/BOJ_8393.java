import java.util.Scanner;

public class BOJ_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;

        for(int i=1;i<n+1;i++){
            a +=i;
        }
        System.out.println(a);
        sc.close();
    }
    
}
