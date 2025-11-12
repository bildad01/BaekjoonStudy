import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        int max = 0;
        for (int value : map.values()){
            if (value > max) {
                max = value;
            }
        }

        char result = '?';
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                result = entry.getKey();
                count++;
            }
        }

        if (count>1) {
            System.out.println("?");
        }else{
            System.out.println(result);
        }

    }
}
