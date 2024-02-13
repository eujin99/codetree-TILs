import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 1;
        int z = 2;

        while(true){
            
            if(n>z){
                x += 1;
                z *= 2;

            }

            if(n==z){
                System.out.print(x);
                break;
            }
        }
    }
}