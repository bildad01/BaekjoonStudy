
import java.util.Scanner;

public class BOJ_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxVal = -1;
        int maxRow = 0;
        int maxCol = 0;

        for(int i = 0; i < 9; i++){

            int[] row = new int[9];
            for (int j = 0; j < 9; j++){
                row[j] =sc.nextInt();
            }
            int rowMax = row[0];
            int rowMaxCol = 0;

            for (int j= 1; j<9; j++){
                if (row[j]>rowMax) {
                    rowMax = row[j];
                    rowMaxCol = j;
                }
            }
            if (rowMax > maxVal){
                maxVal = rowMax;
                maxRow = i;
                maxCol = rowMaxCol;
            }
        }
        System.out.println(maxVal);
        System.out.println((maxRow+1) + " " + (maxCol + 1));
        sc.close();
    }
    
}
