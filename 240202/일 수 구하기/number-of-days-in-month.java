import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ((n%2==1 && n<8) || (n%2==0 && n>=8)){
            System.out.println("31");
        } else if ((n%2==0 && n!=2 && n<8) || (n%2==1 && n>=8)){
            System.out.println("30");
        } else{
            System.out.println("28");
        }
    }
}