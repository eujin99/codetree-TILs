import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        int sum=0;
        int i = 0;

        while (sc.hasNextInt()) {
            age = sc.nextInt();

            if(age>=30){
                break;
            }
            i += age;
            sum++;
        }
        double avg=(double)i/sum;
        System.out.printf("%.2f",avg);
    }
}