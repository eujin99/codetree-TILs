import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        int sum = 0;
        int cnt = 0;

        while (true) {
            age = sc.nextInt();
            if (age < 30) {
                sum += age;
                cnt++;
            } else {
                break;
            }
        }

        double avg = (double) sum / cnt;
        System.out.printf("%.2f", avg);
        
        sc.close(); // while 루프 종료 후에 Scanner를 닫음
    }
}