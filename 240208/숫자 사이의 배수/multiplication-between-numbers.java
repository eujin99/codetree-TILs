import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int sumVal = 0;

        for(int i=a; i<=b; i++){
            if(i%5==0 || i%7==0){
                sum+=i;
                sumVal++;
            }
        }
        double avg = (double)sum/sumVal;

        System.out.printf("%d %.1f", sum, avg);
        
    }
}