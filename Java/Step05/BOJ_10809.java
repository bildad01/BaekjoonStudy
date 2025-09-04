import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        int[] pos = new int[26];
        Arrays.fill(pos, -1);
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);            // i번째 문자 꺼내기
            int idx = c - 'a';               // 알파벳 번호 구하기
            if (pos[idx] == -1) {            // 아직 기록 안 했다면
                pos[idx] = i;                // 현재 위치 기록
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(pos[i] + " ");
        }
    }
    
}
