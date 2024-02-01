import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cm = sc.nextInt();
        int kg = sc.nextInt();
        
        int bmi = (kg*10000)/(cm*cm);

        System.out.println(bmi);

        if(bmi>=25){
            System.out.println("Obesity");
        }
    }
}