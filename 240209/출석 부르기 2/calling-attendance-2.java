import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        while(true){
            n = sc.nextInt();

            if(n==1){
                System.out.println("John");
            }
            if(n==2){
                System.out.println("Tom");
            }
            if(n==3){
                System.out.println("Paul");
            }
            if(n==4){
                System.out.println("Sam");
            }
            if(n>=5){
                System.out.println("Vacancy");
                break;
            }
        }
    }
}