import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int n = sc.nextInt();

       for(int i=a+n; i<=((a+n)+(a*n)); i+=n){

        System.out.println(i);
       }
    }
}