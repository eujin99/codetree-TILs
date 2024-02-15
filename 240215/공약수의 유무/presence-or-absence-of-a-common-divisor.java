import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean e = false;

        for (int i = a; i <= b; i++) {
            if (1920 % i == 0 && 2880 % i == 0) {
                e = true;
                break;
            }
        }
        if (e) { // e가 true이면 공약수가 존재
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}