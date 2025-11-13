import java.util.Scanner;

public class BOJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;

        for(int i = 0; i < n; i++){
            String word = sc.next();
            for (int j = 0; j < word.length()-1; j++){
                if (word.charAt(j) == word.charAt(j+1)){
                    continue;
                }
                if (word.substring(j + 1).contains(String.valueOf(word.charAt(j)))) {
                    count -= 1;
                    break;
                }

            }
        }System.out.println(count);
        sc.close();

    }
    
}
