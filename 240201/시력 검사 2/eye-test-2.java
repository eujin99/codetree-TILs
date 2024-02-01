import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (a >= 1.0){
            System.out.println("High");
        } else if (a >=5.0){
            System.out.println("Middel");
        } else{

            System.out.println("Low");
        }

    }
}