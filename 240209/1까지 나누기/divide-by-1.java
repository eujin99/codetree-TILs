import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int divisor = 1;
        
        while (n > 1) {
            n /= divisor;
            divisor++;
            count++;
        }
        
        System.out.println(count);
    }
}