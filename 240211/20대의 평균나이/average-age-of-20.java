import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        while (sc.hasNextInt()) {
            int age = sc.nextInt();
            if (age < 30) {
                sum += age;
                cnt++;
            } else {
                break;
            }
        }

        if (cnt > 0) { // 입력된 값이 적어도 하나 있을 때만 평균 계산
            double avg = (double) sum / cnt;
            System.out.printf("%.2f", avg);
        } else {
            System.out.println("No input provided."); // 입력이 없는 경우 메시지 출력
        }

        sc.close(); // Scanner 닫기
    }
}