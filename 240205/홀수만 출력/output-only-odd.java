import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // a부터 b까지의 홀수를 출력
        for(int i = a; i <= b; i++){
            if(i % 2 != 0){ // 홀수인 경우에만 출력
                System.out.print(i + " ");
            }
        }
    }
}