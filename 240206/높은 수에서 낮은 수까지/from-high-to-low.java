import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            for(int i=a; i>=b; i--){
                System.out.print(i + " ");
            }
        }

        if(b>a){
            for(int i=b; i>=a; i--){
                System.out.print(i+ " ");
            }
        }
        if(a==b){
            System.out.print(a);
        }
    }
}