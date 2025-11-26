package Java.Step07;

import java.util.Scanner;

public class BOJ_10798 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
        }

        int maxlen = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i].length() > maxlen) {
                maxlen = arr[i].length();
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int col = 0; col < maxlen; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < arr[row].length()) {
                    sb.append(arr[row].charAt(col));
                }
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}