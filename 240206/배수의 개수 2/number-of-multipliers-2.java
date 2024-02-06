import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            if(a % 2 == 1){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}