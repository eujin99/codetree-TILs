import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        boolean isComposite = false;
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isComposite = true;
                    break;
                }
            }
        }
        
        if (isComposite) {
            System.out.println("C");
        } else {
            System.out.println("N");
        }
        
        scanner.close();
    }
}