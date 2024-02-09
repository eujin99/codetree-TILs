import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for(int i = 1; i<100; i++){
            if(n<=1){
                System.out.print(count);
                break;
            }
            n /=i;
            count++;
        }

    }
}