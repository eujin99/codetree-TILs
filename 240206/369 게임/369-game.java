import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            boolean z = false;
            int number = i;
            
           
            while(number != 0) {
                int digit = number % 10;
                if(digit == 3 || digit == 6 || digit == 9) {
                    z = true;
                    break;
                }
                number /= 10;
            }
            
            
            if(i % 3 == 0)
                z = true;
            
            if(z) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}