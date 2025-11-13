import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 등급-점수 매핑
        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double sumPoints = 0.0;   // 학점 × 점수 합
        double sumCredits = 0.0;  // 학점 합

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();

            if (grade.equals("P")) {
                continue;  // P는 계산에서 제외
            }

            sumPoints += credit * gradeMap.get(grade);  // 분자
            sumCredits += credit;                       // 분모
        }

        if (sumCredits == 0) {
            System.out.println("0.0");
        } else {
            System.out.println(sumPoints / sumCredits);
        }

        sc.close();
    }
}
