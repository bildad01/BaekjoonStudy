import java.util.Scanner;

public class BOJ_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // long A = sc.nextInt();
        // long B = sc.nextInt();
        // long C = sc.nextInt()


        String[] input = sc.nextLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);
        long C = Long.parseLong(input[2]);

        System.out.println(A+B+C);
        sc.close();




    }
    
}
